.class public Lu6/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/n1$a;
    }
.end annotation


# instance fields
.field private final a:Lt8/d;

.field private final b:Lt6/d4$b;

.field private final c:Lt6/d4$d;

.field private final d:Lu6/n1$a;

.field private final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lu6/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lt8/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/r<",
            "Lu6/b;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lt6/j3;

.field private s:Lt8/o;

.field private t:Z


# direct methods
.method public constructor <init>(Lt8/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/d;

    iput-object v0, p0, Lu6/n1;->a:Lt8/d;

    new-instance v0, Lt8/r;

    invoke-static {}, Lt8/r0;->Q()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lu6/k0;

    invoke-direct {v2}, Lu6/k0;-><init>()V

    invoke-direct {v0, v1, p1, v2}, Lt8/r;-><init>(Landroid/os/Looper;Lt8/d;Lt8/r$b;)V

    iput-object v0, p0, Lu6/n1;->f:Lt8/r;

    new-instance p1, Lt6/d4$b;

    invoke-direct {p1}, Lt6/d4$b;-><init>()V

    iput-object p1, p0, Lu6/n1;->b:Lt6/d4$b;

    new-instance v0, Lt6/d4$d;

    invoke-direct {v0}, Lt6/d4$d;-><init>()V

    iput-object v0, p0, Lu6/n1;->c:Lt6/d4$d;

    new-instance v0, Lu6/n1$a;

    invoke-direct {v0, p1}, Lu6/n1$a;-><init>(Lt6/d4$b;)V

    iput-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lu6/n1;->e:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic A0(Lu6/b$a;ZILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->M1(Lu6/b$a;ZILu6/b;)V

    return-void
.end method

.method private static synthetic A1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->m(Lu6/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic B0(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->O1(Lu6/b$a;ILu6/b;)V

    return-void
.end method

.method private static synthetic B1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->e(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic C0(Lu6/b$a;Lt6/i4;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->a2(Lu6/b$a;Lt6/i4;Lu6/b;)V

    return-void
.end method

.method private static synthetic C1(Lu6/b$a;IJLu6/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lu6/b;->d0(Lu6/b$a;IJ)V

    return-void
.end method

.method public static synthetic D0(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->j1(Lu6/b$a;Lw6/e;Lu6/b;)V

    return-void
.end method

.method private static synthetic D1(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->d(Lu6/b$a;Z)V

    invoke-interface {p2, p0, p1}, Lu6/b;->E(Lu6/b$a;Z)V

    return-void
.end method

.method public static synthetic E0(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->P1(Lu6/b$a;ILu6/b;)V

    return-void
.end method

.method private static synthetic E1(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->y(Lu6/b$a;Z)V

    return-void
.end method

.method public static synthetic F0(Lu6/b$a;ZILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->S1(Lu6/b$a;ZILu6/b;)V

    return-void
.end method

.method private static synthetic F1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->G(Lu6/b$a;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic G0(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->I1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V

    return-void
.end method

.method private static synthetic G1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->B(Lu6/b$a;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic H0(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->k1(Lu6/b$a;Lw6/e;Lu6/b;)V

    return-void
.end method

.method private static synthetic H1(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;ZLu6/b;)V
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lu6/b;->v(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic I0(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->Z1(Lu6/b$a;ILu6/b;)V

    return-void
.end method

.method private static synthetic I1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->b(Lu6/b$a;Lv7/u;Lv7/x;)V

    return-void
.end method

.method public static synthetic J0(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->D1(Lu6/b$a;ZLu6/b;)V

    return-void
.end method

.method private static synthetic J1(Lu6/b$a;Lt6/c2;ILu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->m0(Lu6/b$a;Lt6/c2;I)V

    return-void
.end method

.method public static synthetic K(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->g1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V

    return-void
.end method

.method public static synthetic K0(Lu6/n1;Lt6/j3;Lu6/b;Lt8/l;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu6/n1;->m2(Lt6/j3;Lu6/b;Lt8/l;)V

    return-void
.end method

.method private static synthetic K1(Lu6/b$a;Lt6/h2;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->a(Lu6/b$a;Lt6/h2;)V

    return-void
.end method

.method public static synthetic L(Lu6/b$a;IZLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->u1(Lu6/b$a;IZLu6/b;)V

    return-void
.end method

.method public static synthetic L0(Lu6/b;Lt8/l;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->d1(Lu6/b;Lt8/l;)V

    return-void
.end method

.method private static synthetic L1(Lu6/b$a;Ll7/a;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->i0(Lu6/b$a;Ll7/a;)V

    return-void
.end method

.method public static synthetic M(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->E1(Lu6/b$a;ZLu6/b;)V

    return-void
.end method

.method public static synthetic M0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->y1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic M1(Lu6/b$a;ZILu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->p(Lu6/b$a;ZI)V

    return-void
.end method

.method public static synthetic N(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->i2(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V

    return-void
.end method

.method public static synthetic N0(Lu6/b$a;JLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->m1(Lu6/b$a;JLu6/b;)V

    return-void
.end method

.method private static synthetic N1(Lu6/b$a;Lt6/i3;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->T(Lu6/b$a;Lt6/i3;)V

    return-void
.end method

.method public static synthetic O(Lu6/n1;)V
    .locals 0

    invoke-direct {p0}, Lu6/n1;->n2()V

    return-void
.end method

.method public static synthetic O0(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->g2(Lu6/b$a;Lw6/e;Lu6/b;)V

    return-void
.end method

.method private static synthetic O1(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->l0(Lu6/b$a;I)V

    return-void
.end method

.method public static synthetic P(Lu6/b$a;Lu8/a0;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->j2(Lu6/b$a;Lu8/a0;Lu6/b;)V

    return-void
.end method

.method public static synthetic P0(Lu6/b$a;Ljava/lang/String;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->i1(Lu6/b$a;Ljava/lang/String;Lu6/b;)V

    return-void
.end method

.method private static synthetic P1(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->h(Lu6/b$a;I)V

    return-void
.end method

.method public static synthetic Q(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->V1(Lu6/b$a;ILu6/b;)V

    return-void
.end method

.method public static synthetic Q0(Lu6/b$a;Ljava/lang/Object;JLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu6/n1;->U1(Lu6/b$a;Ljava/lang/Object;JLu6/b;)V

    return-void
.end method

.method private static synthetic Q1(Lu6/b$a;Lt6/f3;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->c(Lu6/b$a;Lt6/f3;)V

    return-void
.end method

.method public static synthetic R(Lu6/b$a;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->v1(Lu6/b$a;Lv7/x;Lu6/b;)V

    return-void
.end method

.method public static synthetic R0(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->A1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V

    return-void
.end method

.method private static synthetic R1(Lu6/b$a;Lt6/f3;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->O(Lu6/b$a;Lt6/f3;)V

    return-void
.end method

.method public static synthetic S(Lu6/b$a;JILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu6/n1;->h2(Lu6/b$a;JILu6/b;)V

    return-void
.end method

.method public static synthetic S0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->e1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic S1(Lu6/b$a;ZILu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->n(Lu6/b$a;ZI)V

    return-void
.end method

.method public static synthetic T(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->f2(Lu6/b$a;Lw6/e;Lu6/b;)V

    return-void
.end method

.method public static synthetic T0(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lu6/n1;->d2(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V

    return-void
.end method

.method private static synthetic T1(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;Lu6/b;)V
    .locals 0

    invoke-interface {p4, p0, p1}, Lu6/b;->S(Lu6/b$a;I)V

    invoke-interface {p4, p0, p2, p3, p1}, Lu6/b;->H(Lu6/b$a;Lt6/j3$e;Lt6/j3$e;I)V

    return-void
.end method

.method public static synthetic U(Lu6/b$a;Lt6/v;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->t1(Lu6/b$a;Lt6/v;Lu6/b;)V

    return-void
.end method

.method public static synthetic U0(Lu6/b$a;Lt6/f3;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->R1(Lu6/b$a;Lt6/f3;Lu6/b;)V

    return-void
.end method

.method private static synthetic U1(Lu6/b$a;Ljava/lang/Object;JLu6/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lu6/b;->t0(Lu6/b$a;Ljava/lang/Object;J)V

    return-void
.end method

.method public static synthetic V(Lu6/b$a;FLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->k2(Lu6/b$a;FLu6/b;)V

    return-void
.end method

.method private static synthetic V1(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->W(Lu6/b$a;I)V

    return-void
.end method

.method public static synthetic W(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->X1(Lu6/b$a;ZLu6/b;)V

    return-void
.end method

.method private static synthetic W1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->J(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic X(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->B1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private X0(Lv7/a0$b;)Lu6/b$a;
    .locals 3

    iget-object v0, p0, Lu6/n1;->r:Lt6/j3;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v1, p1}, Lu6/n1$a;->f(Lv7/a0$b;)Lt6/d4;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lv7/z;->a:Ljava/lang/Object;

    iget-object v2, p0, Lu6/n1;->b:Lt6/d4$b;

    invoke-virtual {v1, v0, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v0

    iget v0, v0, Lt6/d4$b;->c:I

    invoke-virtual {p0, v1, v0, p1}, Lu6/n1;->W0(Lt6/d4;ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {p1}, Lt6/j3;->G()I

    move-result p1

    iget-object v1, p0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->r()Lt6/d4;

    move-result-object v1

    invoke-virtual {v1}, Lt6/d4;->u()I

    move-result v2

    if-ge p1, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    sget-object v1, Lt6/d4;->a:Lt6/d4;

    :goto_3
    invoke-virtual {p0, v1, p1, v0}, Lu6/n1;->W0(Lt6/d4;ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic X1(Lu6/b$a;ZLu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->g0(Lu6/b$a;Z)V

    return-void
.end method

.method public static synthetic Y(Lu6/b$a;Ljava/util/List;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->r1(Lu6/b$a;Ljava/util/List;Lu6/b;)V

    return-void
.end method

.method private Y0()Lu6/b$a;
    .locals 1

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v0}, Lu6/n1$a;->e()Lv7/a0$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic Y1(Lu6/b$a;IILu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->A(Lu6/b$a;II)V

    return-void
.end method

.method public static synthetic Z(Lu6/b$a;Lt6/i3;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->N1(Lu6/b$a;Lt6/i3;Lu6/b;)V

    return-void
.end method

.method private Z0(ILv7/a0$b;)Lu6/b$a;
    .locals 3

    iget-object v0, p0, Lu6/n1;->r:Lt6/j3;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    iget-object v2, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v2, p2}, Lu6/n1$a;->f(Lv7/a0$b;)Lt6/d4;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-direct {p0, p2}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object v0, Lt6/d4;->a:Lt6/d4;

    invoke-virtual {p0, v0, p1, p2}, Lu6/n1;->W0(Lt6/d4;ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    iget-object p2, p0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {p2}, Lt6/j3;->r()Lt6/d4;

    move-result-object p2

    invoke-virtual {p2}, Lt6/d4;->u()I

    move-result v2

    if-ge p1, v2, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    sget-object p2, Lt6/d4;->a:Lt6/d4;

    :goto_3
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lu6/n1;->W0(Lt6/d4;ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic Z1(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->x0(Lu6/b$a;I)V

    return-void
.end method

.method public static synthetic a0(Lu6/b$a;Lt6/c2;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->J1(Lu6/b$a;Lt6/c2;ILu6/b;)V

    return-void
.end method

.method private a1()Lu6/b$a;
    .locals 1

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v0}, Lu6/n1$a;->g()Lv7/a0$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic a2(Lu6/b$a;Lt6/i4;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->w0(Lu6/b$a;Lt6/i4;)V

    return-void
.end method

.method public static synthetic b0(Lu6/b$a;Lt6/f3;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->Q1(Lu6/b$a;Lt6/f3;Lu6/b;)V

    return-void
.end method

.method private b1()Lu6/b$a;
    .locals 1

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v0}, Lu6/n1$a;->h()Lv7/a0$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic b2(Lu6/b$a;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->t(Lu6/b$a;Lv7/x;)V

    return-void
.end method

.method public static synthetic c0(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->c2(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V

    return-void
.end method

.method private c1(Lt6/f3;)Lu6/b$a;
    .locals 1

    instance-of v0, p1, Lt6/x;

    if-eqz v0, :cond_0

    check-cast p1, Lt6/x;

    iget-object p1, p1, Lt6/x;->y:Lv7/z;

    if-eqz p1, :cond_0

    new-instance v0, Lv7/a0$b;

    invoke-direct {v0, p1}, Lv7/a0$b;-><init>(Lv7/z;)V

    invoke-direct {p0, v0}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic c2(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->s0(Lu6/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d0(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->G1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V

    return-void
.end method

.method private static synthetic d1(Lu6/b;Lt8/l;)V
    .locals 0

    return-void
.end method

.method private static synthetic d2(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V
    .locals 7

    invoke-interface {p6, p0, p1, p2, p3}, Lu6/b;->o(Lu6/b$a;Ljava/lang/String;J)V

    move-object v0, p6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-interface/range {v0 .. v6}, Lu6/b;->D(Lu6/b$a;Ljava/lang/String;JJ)V

    const/4 v3, 0x2

    move-object v1, p6

    move-object v2, p0

    move-object v4, p1

    invoke-interface/range {v1 .. v6}, Lu6/b;->M(Lu6/b$a;ILjava/lang/String;J)V

    return-void
.end method

.method public static synthetic e0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->l2(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic e1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->p0(Lu6/b$a;)V

    return-void
.end method

.method private static synthetic e2(Lu6/b$a;Ljava/lang/String;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->j(Lu6/b$a;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f0(Lu6/b$a;IILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->Y1(Lu6/b$a;IILu6/b;)V

    return-void
.end method

.method private static synthetic f1(Lu6/b$a;Lv6/e;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->k(Lu6/b$a;Lv6/e;)V

    return-void
.end method

.method private static synthetic f2(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lu6/b;->q(Lu6/b$a;Lw6/e;)V

    const/4 v0, 0x2

    invoke-interface {p2, p0, v0, p1}, Lu6/b;->N(Lu6/b$a;ILw6/e;)V

    return-void
.end method

.method public static synthetic g0(Lu6/b$a;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->b2(Lu6/b$a;Lv7/x;Lu6/b;)V

    return-void
.end method

.method private static synthetic g1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->w(Lu6/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic g2(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lu6/b;->y0(Lu6/b$a;Lw6/e;)V

    const/4 v0, 0x2

    invoke-interface {p2, p0, v0, p1}, Lu6/b;->x(Lu6/b$a;ILw6/e;)V

    return-void
.end method

.method public static synthetic h0(Lu6/b$a;Ll7/a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->L1(Lu6/b$a;Ll7/a;Lu6/b;)V

    return-void
.end method

.method private static synthetic h1(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V
    .locals 7

    invoke-interface {p6, p0, p1, p2, p3}, Lu6/b;->g(Lu6/b$a;Ljava/lang/String;J)V

    move-object v0, p6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-interface/range {v0 .. v6}, Lu6/b;->V(Lu6/b$a;Ljava/lang/String;JJ)V

    const/4 v3, 0x1

    move-object v1, p6

    move-object v2, p0

    move-object v4, p1

    invoke-interface/range {v1 .. v6}, Lu6/b;->M(Lu6/b$a;ILjava/lang/String;J)V

    return-void
.end method

.method private static synthetic h2(Lu6/b$a;JILu6/b;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lu6/b;->f(Lu6/b$a;JI)V

    return-void
.end method

.method public static synthetic i0(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->z1(Lu6/b$a;ILu6/b;)V

    return-void
.end method

.method private static synthetic i1(Lu6/b$a;Ljava/lang/String;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->s(Lu6/b$a;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic i2(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1}, Lu6/b;->l(Lu6/b$a;Lt6/u1;)V

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->e0(Lu6/b$a;Lt6/u1;Lw6/i;)V

    const/4 p2, 0x2

    invoke-interface {p3, p0, p2, p1}, Lu6/b;->a0(Lu6/b$a;ILt6/u1;)V

    return-void
.end method

.method public static synthetic j0(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->l1(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V

    return-void
.end method

.method private static synthetic j1(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lu6/b;->o0(Lu6/b$a;Lw6/e;)V

    const/4 v0, 0x1

    invoke-interface {p2, p0, v0, p1}, Lu6/b;->N(Lu6/b$a;ILw6/e;)V

    return-void
.end method

.method private static synthetic j2(Lu6/b$a;Lu8/a0;Lu6/b;)V
    .locals 6

    invoke-interface {p2, p0, p1}, Lu6/b;->r0(Lu6/b$a;Lu8/a0;)V

    iget v2, p1, Lu8/a0;->a:I

    iget v3, p1, Lu8/a0;->b:I

    iget v4, p1, Lu8/a0;->c:I

    iget v5, p1, Lu8/a0;->d:F

    move-object v0, p2

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Lu6/b;->R(Lu6/b$a;IIIF)V

    return-void
.end method

.method public static synthetic k0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->w1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic k1(Lu6/b$a;Lw6/e;Lu6/b;)V
    .locals 1

    invoke-interface {p2, p0, p1}, Lu6/b;->q0(Lu6/b$a;Lw6/e;)V

    const/4 v0, 0x1

    invoke-interface {p2, p0, v0, p1}, Lu6/b;->x(Lu6/b$a;ILw6/e;)V

    return-void
.end method

.method private static synthetic k2(Lu6/b$a;FLu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->L(Lu6/b$a;F)V

    return-void
.end method

.method public static synthetic l0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->W1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic l1(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1}, Lu6/b;->r(Lu6/b$a;Lt6/u1;)V

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->Z(Lu6/b$a;Lt6/u1;Lw6/i;)V

    const/4 p2, 0x1

    invoke-interface {p3, p0, p2, p1}, Lu6/b;->a0(Lu6/b$a;ILt6/u1;)V

    return-void
.end method

.method private static synthetic l2(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->n0(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic m0(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu6/n1;->F1(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V

    return-void
.end method

.method private static synthetic m1(Lu6/b$a;JLu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->i(Lu6/b$a;J)V

    return-void
.end method

.method private synthetic m2(Lt6/j3;Lu6/b;Lt8/l;)V
    .locals 2

    new-instance v0, Lu6/b$b;

    iget-object v1, p0, Lu6/n1;->e:Landroid/util/SparseArray;

    invoke-direct {v0, p3, v1}, Lu6/b$b;-><init>(Lt8/l;Landroid/util/SparseArray;)V

    invoke-interface {p2, p1, v0}, Lu6/b;->k0(Lt6/j3;Lu6/b$b;)V

    return-void
.end method

.method public static synthetic n0(Lu6/b$a;IJJLu6/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lu6/n1;->q1(Lu6/b$a;IJJLu6/b;)V

    return-void
.end method

.method private static synthetic n1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->f0(Lu6/b$a;Ljava/lang/Exception;)V

    return-void
.end method

.method private n2()V
    .locals 3

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/d1;

    invoke-direct {v1, v0}, Lu6/d1;-><init>(Lu6/b$a;)V

    const/16 v2, 0x404

    invoke-virtual {p0, v0, v2, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    iget-object v0, p0, Lu6/n1;->f:Lt8/r;

    invoke-virtual {v0}, Lt8/r;->j()V

    return-void
.end method

.method public static synthetic o0(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu6/n1;->T1(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;Lu6/b;)V

    return-void
.end method

.method private static synthetic o1(Lu6/b$a;IJJLu6/b;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lu6/b;->Q(Lu6/b$a;IJJ)V

    return-void
.end method

.method public static synthetic p0(Lu6/b$a;Lv6/e;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->f1(Lu6/b$a;Lv6/e;Lu6/b;)V

    return-void
.end method

.method private static synthetic p1(Lu6/b$a;Lt6/j3$b;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->v0(Lu6/b$a;Lt6/j3$b;)V

    return-void
.end method

.method public static synthetic q0(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;ZLu6/b;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lu6/n1;->H1(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;ZLu6/b;)V

    return-void
.end method

.method private static synthetic q1(Lu6/b$a;IJJLu6/b;)V
    .locals 7

    move-object v0, p6

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v0 .. v6}, Lu6/b;->P(Lu6/b$a;IJJ)V

    return-void
.end method

.method public static synthetic r0(Lu6/b$a;Lg8/f;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->s1(Lu6/b$a;Lg8/f;Lu6/b;)V

    return-void
.end method

.method private static synthetic r1(Lu6/b$a;Ljava/util/List;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->h0(Lu6/b$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s0(Lu6/b$a;Lt6/h2;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->K1(Lu6/b$a;Lt6/h2;Lu6/b;)V

    return-void
.end method

.method private static synthetic s1(Lu6/b$a;Lg8/f;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->u0(Lu6/b$a;Lg8/f;)V

    return-void
.end method

.method public static synthetic t0(Lu6/b$a;IJLu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu6/n1;->C1(Lu6/b$a;IJLu6/b;)V

    return-void
.end method

.method private static synthetic t1(Lu6/b$a;Lt6/v;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->F(Lu6/b$a;Lt6/v;)V

    return-void
.end method

.method public static synthetic u0(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->n1(Lu6/b$a;Ljava/lang/Exception;Lu6/b;)V

    return-void
.end method

.method private static synthetic u1(Lu6/b$a;IZLu6/b;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lu6/b;->U(Lu6/b$a;IZ)V

    return-void
.end method

.method public static synthetic v0(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lu6/n1;->h1(Lu6/b$a;Ljava/lang/String;JJLu6/b;)V

    return-void
.end method

.method private static synthetic v1(Lu6/b$a;Lv7/x;Lu6/b;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lu6/b;->K(Lu6/b$a;Lv7/x;)V

    return-void
.end method

.method public static synthetic w0(Lu6/b$a;Lt6/j3$b;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->p1(Lu6/b$a;Lt6/j3$b;Lu6/b;)V

    return-void
.end method

.method private static synthetic w1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->z(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic x0(Lu6/b$a;Ljava/lang/String;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lu6/n1;->e2(Lu6/b$a;Ljava/lang/String;Lu6/b;)V

    return-void
.end method

.method private static synthetic x1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->c0(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic y0(Lu6/b$a;IJJLu6/b;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lu6/n1;->o1(Lu6/b$a;IJJLu6/b;)V

    return-void
.end method

.method private static synthetic y1(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-interface {p1, p0}, Lu6/b;->I(Lu6/b$a;)V

    return-void
.end method

.method public static synthetic z0(Lu6/b$a;Lu6/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu6/n1;->x1(Lu6/b$a;Lu6/b;)V

    return-void
.end method

.method private static synthetic z1(Lu6/b$a;ILu6/b;)V
    .locals 0

    invoke-interface {p2, p0}, Lu6/b;->X(Lu6/b$a;)V

    invoke-interface {p2, p0, p1}, Lu6/b;->u(Lu6/b$a;I)V

    return-void
.end method


# virtual methods
.method public final B(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/e1;

    invoke-direct {p2, p1}, Lu6/e1;-><init>(Lu6/b$a;)V

    const/16 v0, 0x402

    invoke-virtual {p0, p1, v0, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final C(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/g1;

    invoke-direct {p2, p1}, Lu6/g1;-><init>(Lu6/b$a;)V

    const/16 v0, 0x401

    invoke-virtual {p0, p1, v0, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final D(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/k;

    invoke-direct {p2, p1, p3, p4}, Lu6/k;-><init>(Lu6/b$a;Lv7/u;Lv7/x;)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public E(Lu6/b;)V
    .locals 1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu6/n1;->f:Lt8/r;

    invoke-virtual {v0, p1}, Lt8/r;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final F(ILv7/a0$b;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/i0;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lu6/i0;-><init>(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final G(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/r0;

    invoke-direct {p2, p1, p3, p4}, Lu6/r0;-><init>(Lu6/b$a;Lv7/u;Lv7/x;)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final H(Ljava/util/List;Lv7/a0$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/a0$b;",
            ">;",
            "Lv7/a0$b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    iget-object v1, p0, Lu6/n1;->r:Lt6/j3;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/j3;

    invoke-virtual {v0, p1, p2, v1}, Lu6/n1$a;->k(Ljava/util/List;Lv7/a0$b;Lt6/j3;)V

    return-void
.end method

.method public final I(ILv7/a0$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/s0;

    invoke-direct {p2, p1, p3}, Lu6/s0;-><init>(Lu6/b$a;Ljava/lang/Exception;)V

    const/16 p3, 0x400

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final J(ILv7/a0$b;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/o0;

    invoke-direct {p2, p1, p3}, Lu6/o0;-><init>(Lu6/b$a;I)V

    const/16 p3, 0x3fe

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method protected final V0()Lu6/b$a;
    .locals 1

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v0}, Lu6/n1$a;->d()Lv7/a0$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lu6/n1;->X0(Lv7/a0$b;)Lu6/b$a;

    move-result-object v0

    return-object v0
.end method

.method protected final W0(Lt6/d4;ILv7/a0$b;)Lu6/b$a;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    iget-object v1, v0, Lu6/n1;->a:Lt8/d;

    invoke-interface {v1}, Lt8/d;->b()J

    move-result-wide v2

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->r()Lt6/d4;

    move-result-object v1

    invoke-virtual {v4, v1}, Lt6/d4;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->G()I

    move-result v1

    if-ne v5, v1, :cond_1

    move v1, v7

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    const-wide/16 v9, 0x0

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lv7/z;->b()Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v1, :cond_2

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->o()I

    move-result v1

    iget v11, v6, Lv7/z;->b:I

    if-ne v1, v11, :cond_2

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->y()I

    move-result v1

    iget v11, v6, Lv7/z;->c:I

    if-ne v1, v11, :cond_2

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    if-eqz v7, :cond_6

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->e()J

    move-result-wide v9

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->B()J

    move-result-wide v7

    goto :goto_4

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lu6/n1;->c:Lt6/d4$d;

    invoke-virtual {v4, v5, v1}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v1

    invoke-virtual {v1}, Lt6/d4$d;->e()J

    move-result-wide v9

    :cond_6
    :goto_3
    move-wide v7, v9

    :goto_4
    iget-object v1, v0, Lu6/n1;->d:Lu6/n1$a;

    invoke-virtual {v1}, Lu6/n1$a;->d()Lv7/a0$b;

    move-result-object v11

    new-instance v16, Lu6/b$a;

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->r()Lt6/d4;

    move-result-object v9

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->G()I

    move-result v10

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->e()J

    move-result-wide v12

    iget-object v1, v0, Lu6/n1;->r:Lt6/j3;

    invoke-interface {v1}, Lt6/j3;->h()J

    move-result-wide v14

    move-object/from16 v1, v16

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-direct/range {v1 .. v15}, Lu6/b$a;-><init>(JLt6/d4;ILv7/a0$b;JLt6/d4;ILv7/a0$b;JJ)V

    return-object v16
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/t;

    invoke-direct {v1, v0, p1}, Lu6/t;-><init>(Lu6/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x3f6

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/e;

    invoke-direct {v1, v0, p1}, Lu6/e;-><init>(Lu6/b$a;Ljava/lang/String;)V

    const/16 p1, 0x3fb

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final c(Lw6/e;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->a1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/z;

    invoke-direct {v1, v0, p1}, Lu6/z;-><init>(Lu6/b$a;Lw6/e;)V

    const/16 p1, 0x3fc

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final d(Ljava/lang/String;JJ)V
    .locals 9

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v7

    new-instance v8, Lu6/m1;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lu6/m1;-><init>(Lu6/b$a;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f8

    invoke-virtual {p0, v7, p1, v8}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final e(Lw6/e;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/g;

    invoke-direct {v1, v0, p1}, Lu6/g;-><init>(Lu6/b$a;Lw6/e;)V

    const/16 p1, 0x3f7

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final f(Lt6/u1;Lw6/i;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/a0;

    invoke-direct {v1, v0, p1, p2}, Lu6/a0;-><init>(Lu6/b$a;Lt6/u1;Lw6/i;)V

    const/16 p1, 0x3f1

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final g(Lt6/u1;Lw6/i;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/n0;

    invoke-direct {v1, v0, p1, p2}, Lu6/n0;-><init>(Lu6/b$a;Lt6/u1;Lw6/i;)V

    const/16 p1, 0x3f9

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final h(Lw6/e;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->a1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/m0;

    invoke-direct {v1, v0, p1}, Lu6/m0;-><init>(Lu6/b$a;Lw6/e;)V

    const/16 p1, 0x3f5

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/m;

    invoke-direct {v1, v0, p1}, Lu6/m;-><init>(Lu6/b$a;Ljava/lang/String;)V

    const/16 p1, 0x3f4

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final j(Ljava/lang/String;JJ)V
    .locals 9

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v7

    new-instance v8, Lu6/j;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lu6/j;-><init>(Lu6/b$a;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f0

    invoke-virtual {p0, v7, p1, v8}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final k(J)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/o;

    invoke-direct {v1, v0, p1, p2}, Lu6/o;-><init>(Lu6/b$a;J)V

    const/16 p1, 0x3f2

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final l(Ljava/lang/Exception;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/j1;

    invoke-direct {v1, v0, p1}, Lu6/j1;-><init>(Lu6/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x406

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final m(Lw6/e;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/c0;

    invoke-direct {v1, v0, p1}, Lu6/c0;-><init>(Lu6/b$a;Lw6/e;)V

    const/16 p1, 0x3ef

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final n(IJ)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->a1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/x;

    invoke-direct {v1, v0, p1, p2, p3}, Lu6/x;-><init>(Lu6/b$a;IJ)V

    const/16 p1, 0x3fa

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final o(Ljava/lang/Object;J)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/a1;

    invoke-direct {v1, v0, p1, p2, p3}, Lu6/a1;-><init>(Lu6/b$a;Ljava/lang/Object;J)V

    const/16 p1, 0x1a

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method protected final o2(Lu6/b$a;ILt8/r$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/b$a;",
            "I",
            "Lt8/r$a<",
            "Lu6/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lu6/n1;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lu6/n1;->f:Lt8/r;

    invoke-virtual {p1, p2, p3}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public final onAudioAttributesChanged(Lv6/e;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/s;

    invoke-direct {v1, v0, p1}, Lu6/s;-><init>(Lu6/b$a;Lv6/e;)V

    const/16 p1, 0x14

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onAvailableCommandsChanged(Lt6/j3$b;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/e0;

    invoke-direct {v1, v0, p1}, Lu6/e0;-><init>(Lu6/b$a;Lt6/j3$b;)V

    const/16 p1, 0xd

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onCues(Lg8/f;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/h0;

    invoke-direct {v1, v0, p1}, Lu6/h0;-><init>(Lu6/b$a;Lg8/f;)V

    const/16 p1, 0x1b

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onCues(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/w0;

    invoke-direct {v1, v0, p1}, Lu6/w0;-><init>(Lu6/b$a;Ljava/util/List;)V

    const/16 p1, 0x1b

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onDeviceInfoChanged(Lt6/v;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/n;

    invoke-direct {v1, v0, p1}, Lu6/n;-><init>(Lu6/b$a;Lt6/v;)V

    const/16 p1, 0x1d

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onDeviceVolumeChanged(IZ)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/f;

    invoke-direct {v1, v0, p1, p2}, Lu6/f;-><init>(Lu6/b$a;IZ)V

    const/16 p1, 0x1e

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onEvents(Lt6/j3;Lt6/j3$c;)V
    .locals 0

    return-void
.end method

.method public final onIsLoadingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/p0;

    invoke-direct {v1, v0, p1}, Lu6/p0;-><init>(Lu6/b$a;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onIsPlayingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/r;

    invoke-direct {v1, v0, p1}, Lu6/r;-><init>(Lu6/b$a;Z)V

    const/4 p1, 0x7

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public final onMediaItemTransition(Lt6/c2;I)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/y;

    invoke-direct {v1, v0, p1, p2}, Lu6/y;-><init>(Lu6/b$a;Lt6/c2;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onMediaMetadataChanged(Lt6/h2;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/f1;

    invoke-direct {v1, v0, p1}, Lu6/f1;-><init>(Lu6/b$a;Lt6/h2;)V

    const/16 p1, 0xe

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onMetadata(Ll7/a;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/c;

    invoke-direct {v1, v0, p1}, Lu6/c;-><init>(Lu6/b$a;Ll7/a;)V

    const/16 p1, 0x1c

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/g0;

    invoke-direct {v1, v0, p1, p2}, Lu6/g0;-><init>(Lu6/b$a;ZI)V

    const/4 p1, 0x5

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlaybackParametersChanged(Lt6/i3;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/q0;

    invoke-direct {v1, v0, p1}, Lu6/q0;-><init>(Lu6/b$a;Lt6/i3;)V

    const/16 p1, 0xc

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/u0;

    invoke-direct {v1, v0, p1}, Lu6/u0;-><init>(Lu6/b$a;I)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlaybackSuppressionReasonChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/v;

    invoke-direct {v1, v0, p1}, Lu6/v;-><init>(Lu6/b$a;I)V

    const/4 p1, 0x6

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlayerError(Lt6/f3;)V
    .locals 2

    invoke-direct {p0, p1}, Lu6/n1;->c1(Lt6/f3;)Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/i;

    invoke-direct {v1, v0, p1}, Lu6/i;-><init>(Lu6/b$a;Lt6/f3;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onPlayerErrorChanged(Lt6/f3;)V
    .locals 2

    invoke-direct {p0, p1}, Lu6/n1;->c1(Lt6/f3;)Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/d;

    invoke-direct {v1, v0, p1}, Lu6/d;-><init>(Lu6/b$a;Lt6/f3;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onPlayerStateChanged(ZI)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/w;

    invoke-direct {v1, v0, p1, p2}, Lu6/w;-><init>(Lu6/b$a;ZI)V

    const/4 p1, -0x1

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onPositionDiscontinuity(I)V
    .locals 0

    return-void
.end method

.method public final onPositionDiscontinuity(Lt6/j3$e;Lt6/j3$e;I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu6/n1;->t:Z

    :cond_0
    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    iget-object v1, p0, Lu6/n1;->r:Lt6/j3;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/j3;

    invoke-virtual {v0, v1}, Lu6/n1$a;->j(Lt6/j3;)V

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/x0;

    invoke-direct {v1, v0, p3, p1, p2}, Lu6/x0;-><init>(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;)V

    const/16 p1, 0xb

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public final onRepeatModeChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/d0;

    invoke-direct {v1, v0, p1}, Lu6/d0;-><init>(Lu6/b$a;I)V

    const/16 p1, 0x8

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onSeekProcessed()V
    .locals 3

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/v0;

    invoke-direct {v1, v0}, Lu6/v0;-><init>(Lu6/b$a;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onSkipSilenceEnabledChanged(Z)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/h1;

    invoke-direct {v1, v0, p1}, Lu6/h1;-><init>(Lu6/b$a;Z)V

    const/16 p1, 0x17

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/f0;

    invoke-direct {v1, v0, p1, p2}, Lu6/f0;-><init>(Lu6/b$a;II)V

    const/16 p1, 0x18

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onTimelineChanged(Lt6/d4;I)V
    .locals 1

    iget-object p1, p0, Lu6/n1;->d:Lu6/n1$a;

    iget-object v0, p0, Lu6/n1;->r:Lt6/j3;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/j3;

    invoke-virtual {p1, v0}, Lu6/n1$a;->l(Lt6/j3;)V

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object p1

    new-instance v0, Lu6/t0;

    invoke-direct {v0, p1, p2}, Lu6/t0;-><init>(Lu6/b$a;I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public onTracksChanged(Lt6/i4;)V
    .locals 2

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/q;

    invoke-direct {v1, v0, p1}, Lu6/q;-><init>(Lu6/b$a;Lt6/i4;)V

    const/4 p1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onVideoSizeChanged(Lu8/a0;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/c1;

    invoke-direct {v1, v0, p1}, Lu6/c1;-><init>(Lu6/b$a;Lu8/a0;)V

    const/16 p1, 0x19

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final onVolumeChanged(F)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/j0;

    invoke-direct {v1, v0, p1}, Lu6/j0;-><init>(Lu6/b$a;F)V

    const/16 p1, 0x16

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final p(Ljava/lang/Exception;)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/l0;

    invoke-direct {v1, v0, p1}, Lu6/l0;-><init>(Lu6/b$a;Ljava/lang/Exception;)V

    const/16 p1, 0x405

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final q(IJJ)V
    .locals 9

    invoke-direct {p0}, Lu6/n1;->b1()Lu6/b$a;

    move-result-object v7

    new-instance v8, Lu6/z0;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lu6/z0;-><init>(Lu6/b$a;IJJ)V

    const/16 p1, 0x3f3

    invoke-virtual {p0, v7, p1, v8}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final r(JI)V
    .locals 2

    invoke-direct {p0}, Lu6/n1;->a1()Lu6/b$a;

    move-result-object v0

    new-instance v1, Lu6/k1;

    invoke-direct {v1, v0, p1, p2, p3}, Lu6/k1;-><init>(Lu6/b$a;JI)V

    const/16 p1, 0x3fd

    invoke-virtual {p0, v0, p1, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lu6/n1;->s:Lt8/o;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/o;

    new-instance v1, Lu6/h;

    invoke-direct {v1, p0}, Lu6/h;-><init>(Lu6/n1;)V

    invoke-interface {v0, v1}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final s(IJJ)V
    .locals 9

    invoke-direct {p0}, Lu6/n1;->Y0()Lu6/b$a;

    move-result-object v7

    new-instance v8, Lu6/i1;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lu6/i1;-><init>(Lu6/b$a;IJJ)V

    const/16 p1, 0x3ee

    invoke-virtual {p0, v7, p1, v8}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final t()V
    .locals 3

    iget-boolean v0, p0, Lu6/n1;->t:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu6/n1;->V0()Lu6/b$a;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lu6/n1;->t:Z

    new-instance v1, Lu6/l1;

    invoke-direct {v1, v0}, Lu6/l1;-><init>(Lu6/b$a;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    :cond_0
    return-void
.end method

.method public final u(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/b1;

    invoke-direct {p2, p1}, Lu6/b1;-><init>(Lu6/b$a;)V

    const/16 v0, 0x3ff

    invoke-virtual {p0, p1, v0, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final v(ILv7/a0$b;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/u;

    invoke-direct {p2, p1, p3}, Lu6/u;-><init>(Lu6/b$a;Lv7/x;)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final w(ILv7/a0$b;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/b0;

    invoke-direct {p2, p1, p3}, Lu6/b0;-><init>(Lu6/b$a;Lv7/x;)V

    const/16 p3, 0x3ed

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final x(ILv7/a0$b;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/y0;

    invoke-direct {p2, p1, p3, p4}, Lu6/y0;-><init>(Lu6/b$a;Lv7/u;Lv7/x;)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public final y(ILv7/a0$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lu6/n1;->Z0(ILv7/a0$b;)Lu6/b$a;

    move-result-object p1

    new-instance p2, Lu6/p;

    invoke-direct {p2, p1}, Lu6/p;-><init>(Lu6/b$a;)V

    const/16 v0, 0x403

    invoke-virtual {p0, p1, v0, p2}, Lu6/n1;->o2(Lu6/b$a;ILt8/r$a;)V

    return-void
.end method

.method public z(Lt6/j3;Landroid/os/Looper;)V
    .locals 2

    iget-object v0, p0, Lu6/n1;->r:Lt6/j3;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/n1;->d:Lu6/n1$a;

    invoke-static {v0}, Lu6/n1$a;->a(Lu6/n1$a;)Lcom/google/common/collect/w;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lt8/a;->g(Z)V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/j3;

    iput-object v0, p0, Lu6/n1;->r:Lt6/j3;

    iget-object v0, p0, Lu6/n1;->a:Lt8/d;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lt8/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt8/o;

    move-result-object v0

    iput-object v0, p0, Lu6/n1;->s:Lt8/o;

    iget-object v0, p0, Lu6/n1;->f:Lt8/r;

    new-instance v1, Lu6/l;

    invoke-direct {v1, p0, p1}, Lu6/l;-><init>(Lu6/n1;Lt6/j3;)V

    invoke-virtual {v0, p2, v1}, Lt8/r;->e(Landroid/os/Looper;Lt8/r$b;)Lt8/r;

    move-result-object p1

    iput-object p1, p0, Lu6/n1;->f:Lt8/r;

    return-void
.end method
