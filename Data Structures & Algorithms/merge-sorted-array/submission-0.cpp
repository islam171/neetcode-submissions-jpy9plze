class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = 0;
        int j = 0;
        vector<int> num;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                num.push_back(nums2[j]);
                j++;
            }else{
                num.push_back(nums1[i]);
                i++;
            }
        }
        while(i < m){
            num.push_back(nums1[i]);
            i++;
        }
        while(j < n){
            num.push_back(nums2[j]);
            j++;
        }
        int k = 0;
        nums1.resize(n+m);
        while(k < n+m){
            nums1[k] = num[k];
            k++;
        }
    }
};