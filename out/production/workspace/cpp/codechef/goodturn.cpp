#include <iostream>
using namespace std;

int main() {
  int cases = 0;
  cin>>cases;
  for(int i=0;i<cases;i++){
    int x = 0;
    int y = 0;

    cin>>x>>y;

    if ((x+y)>6)
      cout<<"YES\n";
    else
      cout<<"NO\n";
  }

  return 0;
}
