#include <iostream>
using namespace std;

int main() {
	int a,b;
	cin >> a>>b;
	int c = b;
	for (int i = 0; i < 3; i++) {
		cout << a * (b % 10) << endl;
		b /= 10;
	}
	cout << c * a << endl;
}
