#include <map>
#include <vector>
#include <iostream>

using namespace std;

map<int, int> prime_factors(int n) {
    map<int, int> factors;
    for (int i = 2; i <= n; i++) {
        while (n % i == 0) {
            factors[i]++;
            n /= i;
        }
    }
    return factors;
}

bool can_transform(vector<int>& A, vector<int>& B) {
    if (A.size() != B.size()) return false;
    int n = A.size();
    map<int, int> factor_count_A, factor_count_B;
    for (int i = 0; i < n; i++) {
        auto factors_A = prime_factors(A[i]);
        auto factors_B = prime_factors(B[i]);
        for (auto &[factor, count] : factors_A) factor_count_A[factor] += count;
        for (auto &[factor, count] : factors_B) factor_count_B[factor] += count;
    }
    return factor_count_A == factor_count_B;
}

int main() {
    vector<int> A = {2, 4, 6};
    vector<int> B = {1, 2, 3};
    if (can_transform(A, B)) {
        cout << "Yes, Bob can convert A into B." << endl;
    } else {
        cout << "No, Bob cannot convert A into B." << endl;
    }
    return 0;
}
