
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Créer une table de hachage pour stocker les nombres et leurs indices
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Parcourir le tableau
        for (int i = 0; i < nums.length; i++) {
            // Calculer le complément
            int complement = target - nums[i];

            // Vérifier si le complément est déjà dans la table de hachage
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            // Sinon, ajouter le nombre actuel et son indice dans la table
            numToIndex.put(nums[i], i);
        }

        // Retourner une exception si aucune solution n'existe
        throw new IllegalArgumentException("Aucune solution trouvée");
    }

    // Méthode principale pour tester la solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Exemple 1
        int[] nums1 = {2, 7, 11, 15};
        int cible1 = 9;
        int[] resultat1 = solution.twoSum(nums1, cible1);
        System.out.println("Résultat : [" + resultat1[0] + ", " + resultat1[1] + "]");

        // Exemple 2
        int[] nums2 = {3, 2, 4};
        int cible2 = 6;
        int[] resultat2 = solution.twoSum(nums2, cible2);
        System.out.println("Résultat : [" + resultat2[0] + ", " + resultat2[1] + "]");

        // Exemple 3
        int[] nums3 = {3, 3};
        int cible3 = 6;
        int[] resultat3 = solution.twoSum(nums3, cible3);
        System.out.println("Résultat : [" + resultat3[0] + ", " + resultat3[1] + "]");
    }
}
