#include <iostream>
using namespace std;
//structure
typedef struct Person
{
    char name[50];
    int age;
    float salary;
    char department[50];
}ep;

int main()
{
    Person p1;
    cout << "Enter Full name: ";
    cin.get(p1.name, 50);
    cout << "Enter age: ";
    cin >> p1.age;
    cout << "Enter salary: ";
    cin >> p1.salary;
    cout <<"Department: ";
    cin>> p1.department;

    cout << "\nDisplaying Information." << endl;
    cout << "Name: " << p1.name << endl;
    cout << "Age: " << p1.age << endl;
    cout << "Salary: " << p1.salary<<endl;
    cout << "Department: " << p1.department<<endl;
 
    return 0;
}