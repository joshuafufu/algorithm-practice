void Unknown(int *num, int p) {
	*num = p + 2;
}

void HardToFollow(int *p, int q, int *num) {
	*p = q + *num;
	*num = q;
	num = p;
	p = &q;
	Unknown(num, *p);
}

int main() {
	int *p;
	int trouble[3];
	trouble[0] = 1;
	p = &trouble[1];
	*p = 2;
	trouble[2] = 3;
	
	printf("p is %d\n", *p);
	printf("trouble 0 is %d\n", trouble[0]);
	printf("trouble 2 is %d\n", trouble[2]);

	HardToFollow(p, trouble[0], &trouble[2]);
	
	printf("p is %d\n", *p);
        printf("trouble 0 is %d\n", trouble[0]);
        printf("trouble 2 is %d\n", trouble[2]);

	Unknown(&trouble[0], *p);

	printf("p is %d\n", *p);
	printf("trouble 0 is %d\n", trouble[0]);
	printf("trouble 2 is %d\n", trouble[2]);

}

