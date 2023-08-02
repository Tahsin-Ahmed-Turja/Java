#include <bits/stdc++.h>
#define ll long long int
#define endl "\n"
using namespace std;
const int N = 1e7 + 10;

vector<int> primes;
set<int> a, b;
map<int, int> ma;
void sive()
{
    int n = sqrt(N);
    vector<bool> is_prime(n + 1, true);
    is_prime[0] = is_prime[1] = false;
    for (int i = 2; i * i * 1ll <= n; i++)
    {
        if (is_prime[i])
        {
            for (int j = i * i; j <= n; j += i)
                is_prime[j] = false;
        }
    }
    primes.push_back(2);
    for (int i = 3; i <= n; i += 2)
    {
        if (is_prime[i])
            primes.push_back(i);
    }
}
void facta(int x)
{
    int cnt = 0;
    for (auto p : primes)
    {
        if (x % p == 0)
        {
            a.insert(p);
            cnt = 0;
        }
        while (x % p == 0)
        {
            // ma[p]++;
            x /= p;
            cnt++;
        }
        ma[p] = max(ma[p], cnt);
    }
    if (x > 1)
    {
        a.insert(x);
        // ma[x]++;
        ma[x] = max(ma[x], 1);
    }
}
void factb(int x)
{
    for (auto p : primes)
    {
        if (x % p == 0)
        {
            b.insert(p);
        }
        while (x % p == 0)
            x /= p;
    }
    if (x > 1)
        b.insert(x);
}
void solve()
{
    int n;
    cin >> n;
    vector<int> va(n), vb(n);
    int gc = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> va[i];
        facta(va[i]);
        gc = __gcd(gc, va[i]);
    }
    cout<<gc<<endl;
    for (int i = 0; i < n; i++)
    {
        cin >> vb[i];
        factb(vb[i]);
    }
    // for (auto s : a)
    //     cout << s << ' ';
    // cout << endl;
    // forc (auto s : b)
    //     out << s << ' ';
    // cout << endl;
    bool ok = true;
    for (auto s : b)
    {
        if (a.count(s))
        {
            continue;
        }
        else
        {
            ok = false;
            break;
        }
    }
    cout << (ok ? "Yes" : "No");

    if (va[0] >= vb[0])
    {
        if (va[0] % vb[0] != 0)
        {
            cout << ' ' << "No" << endl;
            return;
        }
        set<int> ss;
        for (int i = 0; i < n; i++)
        {
            if (va[i] % vb[i] != 0)
            {
                cout << ' ' << "No" << endl;
                return;
            }
            ss.insert(va[i] / vb[i]);
        }
        if (ss.size() != 1)
        {
            cout << ' ' << "No" << endl;
            return;
        }
        if (ss.size() == 1)
        {
            // int x = *ss.begin();
            // bool okk = true;
            // // cout << x << endl;
            // int cnt = 0;
            // for (auto p : primes)
            // {
            //     if (x % p == 0)
            //     {
            //         cnt = 0;
            //         if (a.count(p) == 0)
            //         {
            //             okk = false;
            //         }
            //     }
            //     while (x % p == 0)
            //         x /= p, cnt++;
            //     // cout << okk << ' ' << endl;
            //     if (cnt > ma[p])
            //         okk = false;
            // }
            // if (x > 1)
            // {
            //     if (a.count(x))
            //     {
            //         ;
            //     }
            //     else
            //     {
            //         okk = false;
            //     }
            // }
            // cout << (okk ? " Yes" : " No") << endl;
            cout << " Yes" << endl;
            return;
        }
        //  cout << (okk ? " Yes" : " No") << endl;
        // r/eturn;
    }
    else
    {
        if (vb[0] % va[0] != 0)
        {
            cout << ' ' << "No" << endl;
            return;
        }
        set<int> ss;
        for (int i = 0; i < n; i++)
        {
            if (vb[i] % va[i] != 0)
            {
                cout << ' ' << "No" << endl;
                return;
            }
            ss.insert(vb[i] / va[i]);
        }
        if (ss.size() != 1)
        {
            cout << ' ' << "No" << endl;
            return;
        }

        if (ss.size() == 1)
        {
            // int x = *ss.begin();
            // bool okk = true;
            // int cnt = 0;
            // for (auto p : primes)
            // {
            //     if (x % p == 0)
            //     {
            //         if (a.count(p) == 0)
            //         {
            //             cnt = 0;
            //             okk = false;
            //         }
            //     }
            //     while (x % p == 0)
            //         x /= p, cnt++;

            //     if (cnt > ma[p])
            //         okk = false;
            // }
            // if (x > 1)
            // {
            //     if (a.count(x))
            //     {
            //         ;
            //     }
            //     else
            //     {
            //         okk = false;
            //     }
            // }
            // cout << (okk ? " Yes" : " No") << endl;
            // return;
            cout << " Yes" << endl;
            return;
        }
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t = 1;
    sive();
    cin >> t;
    for (int ii = 1; ii <= t; ii++)
    {
        a.clear();
        b.clear();
        ma.clear();
        cout << "Case " << ii << ": ";
        solve();
    }
    return 0;
}
