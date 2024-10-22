package net.hanas_cards.util;

import net.hanas_cards.config.ModConfigs;

import java.util.NavigableMap;
import java.util.TreeMap;

public class GradingSystem {
    // Map to hold grade thresholds and their descriptions
    private static final NavigableMap<Float, String> gradeDescriptions = new TreeMap<>();

    // Static initializer to populate the grade descriptions
    static {
        gradeDescriptions.put(1.0f, "Trash");
        gradeDescriptions.put(1.5f, "Soggy");
        gradeDescriptions.put(2.0f, "Fair");
        gradeDescriptions.put(3.0f, "Good");
        gradeDescriptions.put(3.5f, "Really Good");
        gradeDescriptions.put(4.0f, "Excellent");
        gradeDescriptions.put(4.5f, "Mint");
        gradeDescriptions.put(5.0f, "Perfectly Mint");
    }

    /**
     * Retrieves the description for a specific grade.
     * If the grade is 5.0f, returns "Perfectly Mint".
     * If the grade is above 4.5f but below 5.0f, returns "Mint".
     * Otherwise, rounds down to the closest lower or equal grade.
     *
     * @param grade the grade value to look up
     * @return the description corresponding to the given grade
     */
    public static String getGradeDescription(float grade) {
        // Handle special case where grade is exactly 5.0f.
        if (grade == 5.0f) {
            return "Perfectly Mint";
        }

        // Handle cases where the grade is less than 1.5f.
        if (grade < 1.5F) {
            return "Trash";
        }

        // Handle Mint if grade is above 4.5f.
        if (grade > 4.5f) {
            return "Mint";
        }

        // Use floorEntry to get the closest lower or equal grade.
        var entry = gradeDescriptions.floorEntry(grade);
        return (entry != null) ? entry.getValue() : "Unknown Grade";
    }

    /**
     * Checks if the given grade exists in the predefined map.
     *
     * @param grade the grade to check.
     * @return true if the grade exists, false otherwise.
     */
    public static boolean isValidGrade(float grade) {
        return gradeDescriptions.containsKey(grade);
    }

    /**
     * Adds or updates a grade description.
     *
     * @param grade       the grade to add or update.
     * @param description the description associated with the grade.
     */
    public static void addGradeDescription(float grade, String description) {
        gradeDescriptions.put(grade, description);
    }

    /**
     * Generates a random grade between the configured min and max grade.
     * The result is rounded up to the next highest tenth.
     *
     * @return the generated grade as a float.
     */
    public static float generateRandomGrade() {
        float minGrade = ModConfigs.MinGrade;
        float maxGrade = ModConfigs.MaxGrade;

        // Ensure the min and max values are valid.
        if (minGrade < 1.0f || maxGrade > 5.0f || minGrade > maxGrade) {
            throw new IllegalArgumentException("Invalid grade range in config: " + minGrade + " to " + maxGrade);
        }

        // Generate a random float between the min and max grade.
        float randomGrade = minGrade + (float) (Math.random() * (maxGrade - minGrade));

        // Round up to the nearest tenth.
        return (float) Math.ceil(randomGrade * 10) / 10;
    }
}