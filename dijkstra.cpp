#include <bits/stdc++.h>
#include <vector>

using namespace std;

int INF = 1000000;

void dijkstrafast(vector<vector<pair<int, int>>> AdjList, int n, int S, int T)
{
    vector<int> dist(n, INF);
    dist[S] = 0;
    queue<int> q;
    q.push(S);
    vector<int> in_queue(n, 0);
    in_queue[S] = 1;
    while (!q.empty())
    {
        int u = q.front();
        q.pop();
        in_queue[u] = 0;
        for (int j = 0; j < (int)AdjList[u].size(); j++)
        {
            int v = AdjList[u][j].first, weight_u_v = AdjList[u][j].second;
            if (dist[u] + weight_u_v < dist[v])
            {
                dist[v] = dist[u] + weight_u_v;
                if (!in_queue[v])   //Agregamos a la cola solo si no esta en la cola
                {
                    q.push(v);
                    in_queue[v] = 1;
                }
            }
        }
    }
    if (dist[T] != INF) printf("%d\n", dist[T]);
    else                printf("unreachable\n");
}

int main ()
{
    int n = 7;
    int S = 0; //start
    int T = 6; // end   

    vector<vector<pair<int, int>>> AdjList;
    for(int i = 0; i < n; i++)
    {
        vector<pair<int, int> > row;
        AdjList.push_back(row);
    }
    // node 0 to 1 dist 2
    // node 0 to 2 dist 3
    AdjList[0].push_back(make_pair(1, 2));
    AdjList[0].push_back(make_pair(2, 3));

    AdjList[1].push_back(make_pair(0, 2));
    AdjList[1].push_back(make_pair(5, 1));

    AdjList[2].push_back(make_pair(0, 3));
    AdjList[2].push_back(make_pair(5, 2));

    AdjList[3].push_back(make_pair(1, 4));
    AdjList[3].push_back(make_pair(4, 1));
    AdjList[3].push_back(make_pair(6, 2));

    AdjList[4].push_back(make_pair(3, 1));
    AdjList[4].push_back(make_pair(5, 2));
    AdjList[4].push_back(make_pair(6, 1));

    AdjList[5].push_back(make_pair(1, 1));
    AdjList[5].push_back(make_pair(2, 2));
    AdjList[5].push_back(make_pair(4, 2));
    AdjList[5].push_back(make_pair(6, 2));

    AdjList[6].push_back(make_pair(3, 2));
    AdjList[6].push_back(make_pair(4, 1));
    AdjList[6].push_back(make_pair(5, 2));

    dijkstrafast(AdjList, n, S, T);
}

