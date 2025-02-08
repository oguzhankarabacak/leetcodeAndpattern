package DynamicProgramming;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReachable = 0; // En fazla ulaşılabilen index

        for (int i = 0; i < nums.length; i++) {
            // Eğer bulunduğumuz index, ulaşılabilir maksimum noktayı geçtiyse
            if (i > maxReachable) return false;

            // Ulaşılabilecek en uzak noktayı güncelle
            maxReachable = Math.max(maxReachable, i + nums[i]);

            // Eğer ulaşılabilir en uzak nokta son indexi geçiyorsa, hemen true dön
            if (maxReachable >= nums.length - 1) return true;
        }

        return true;
    }
}
