.class public final Lv9/b;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv9/b$a;,
        Lv9/b$e;,
        Lv9/b$b;,
        Lv9/b$d;,
        Lv9/b$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv9/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lv9/b$e;

.field private final b:Lv9/b$b;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:I

.field private final f:Lv9/b$d;

.field private final r:Lv9/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/n;

    invoke-direct {v0}, Lv9/n;-><init>()V

    sput-object v0, Lv9/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lv9/b$e;Lv9/b$b;Ljava/lang/String;ZILv9/b$d;Lv9/b$c;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$e;

    iput-object p1, p0, Lv9/b;->a:Lv9/b$e;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$b;

    iput-object p1, p0, Lv9/b;->b:Lv9/b$b;

    iput-object p3, p0, Lv9/b;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lv9/b;->d:Z

    iput p5, p0, Lv9/b;->e:I

    const/4 p1, 0x0

    if-nez p6, :cond_0

    invoke-static {}, Lv9/b$d;->u1()Lv9/b$d$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lv9/b$d$a;->b(Z)Lv9/b$d$a;

    invoke-virtual {p2}, Lv9/b$d$a;->a()Lv9/b$d;

    move-result-object p6

    :cond_0
    iput-object p6, p0, Lv9/b;->f:Lv9/b$d;

    if-nez p7, :cond_1

    invoke-static {}, Lv9/b$c;->u1()Lv9/b$c$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lv9/b$c$a;->b(Z)Lv9/b$c$a;

    invoke-virtual {p2}, Lv9/b$c$a;->a()Lv9/b$c;

    move-result-object p7

    :cond_1
    iput-object p7, p0, Lv9/b;->r:Lv9/b$c;

    return-void
.end method

.method public static A1(Lv9/b;)Lv9/b$a;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lv9/b;->u1()Lv9/b$a;

    move-result-object v0

    invoke-virtual {p0}, Lv9/b;->v1()Lv9/b$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/b$a;->c(Lv9/b$b;)Lv9/b$a;

    invoke-virtual {p0}, Lv9/b;->y1()Lv9/b$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/b$a;->f(Lv9/b$e;)Lv9/b$a;

    invoke-virtual {p0}, Lv9/b;->x1()Lv9/b$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/b$a;->e(Lv9/b$d;)Lv9/b$a;

    invoke-virtual {p0}, Lv9/b;->w1()Lv9/b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/b$a;->d(Lv9/b$c;)Lv9/b$a;

    iget-boolean v1, p0, Lv9/b;->d:Z

    invoke-virtual {v0, v1}, Lv9/b$a;->b(Z)Lv9/b$a;

    iget v1, p0, Lv9/b;->e:I

    invoke-virtual {v0, v1}, Lv9/b$a;->h(I)Lv9/b$a;

    iget-object p0, p0, Lv9/b;->c:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lv9/b$a;->g(Ljava/lang/String;)Lv9/b$a;

    :cond_0
    return-object v0
.end method

.method public static u1()Lv9/b$a;
    .locals 1

    new-instance v0, Lv9/b$a;

    invoke-direct {v0}, Lv9/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv9/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv9/b;

    iget-object v0, p0, Lv9/b;->a:Lv9/b$e;

    iget-object v2, p1, Lv9/b;->a:Lv9/b$e;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/b;->b:Lv9/b$b;

    iget-object v2, p1, Lv9/b;->b:Lv9/b$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/b;->f:Lv9/b$d;

    iget-object v2, p1, Lv9/b;->f:Lv9/b$d;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/b;->r:Lv9/b$c;

    iget-object v2, p1, Lv9/b;->r:Lv9/b$c;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/b;->c:Ljava/lang/String;

    iget-object v2, p1, Lv9/b;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lv9/b;->d:Z

    iget-boolean v2, p1, Lv9/b;->d:Z

    if-ne v0, v2, :cond_1

    iget v0, p0, Lv9/b;->e:I

    iget p1, p1, Lv9/b;->e:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lv9/b;->a:Lv9/b$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lv9/b;->b:Lv9/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lv9/b;->f:Lv9/b$d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lv9/b;->r:Lv9/b$c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lv9/b;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-boolean v1, p0, Lv9/b;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public v1()Lv9/b$b;
    .locals 1

    iget-object v0, p0, Lv9/b;->b:Lv9/b$b;

    return-object v0
.end method

.method public w1()Lv9/b$c;
    .locals 1

    iget-object v0, p0, Lv9/b;->r:Lv9/b$c;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lv9/b;->y1()Lv9/b$e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lv9/b;->v1()Lv9/b$b;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lv9/b;->c:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lv9/b;->z1()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x5

    iget v2, p0, Lv9/b;->e:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lv9/b;->x1()Lv9/b$d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lv9/b;->w1()Lv9/b$c;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Lv9/b$d;
    .locals 1

    iget-object v0, p0, Lv9/b;->f:Lv9/b$d;

    return-object v0
.end method

.method public y1()Lv9/b$e;
    .locals 1

    iget-object v0, p0, Lv9/b;->a:Lv9/b$e;

    return-object v0
.end method

.method public z1()Z
    .locals 1

    iget-boolean v0, p0, Lv9/b;->d:Z

    return v0
.end method
