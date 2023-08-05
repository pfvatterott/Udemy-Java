package Section6;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double areaOfExistingBuckets = areaPerBucket * (double) extraBuckets;
        double remainingArea = wallArea - areaOfExistingBuckets;
        double bucketsNeeded = Math.ceil(remainingArea / areaPerBucket);
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        return (int) bucketsNeeded;
    }
}
