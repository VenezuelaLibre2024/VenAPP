.class public Lv9/e;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv9/e$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv9/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/r;

    invoke-direct {v0}, Lv9/r;-><init>()V

    sput-object v0, Lv9/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv9/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lv9/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lv9/e;->c:Ljava/lang/String;

    iput-object p4, p0, Lv9/e;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lv9/e;->e:Z

    iput p6, p0, Lv9/e;->f:I

    return-void
.end method

.method public static u1()Lv9/e$a;
    .locals 1

    new-instance v0, Lv9/e$a;

    invoke-direct {v0}, Lv9/e$a;-><init>()V

    return-object v0
.end method

.method public static z1(Lv9/e;)Lv9/e$a;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lv9/e;->u1()Lv9/e$a;

    move-result-object v0

    invoke-virtual {p0}, Lv9/e;->x1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/e$a;->e(Ljava/lang/String;)Lv9/e$a;

    invoke-virtual {p0}, Lv9/e;->w1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/e$a;->c(Ljava/lang/String;)Lv9/e$a;

    invoke-virtual {p0}, Lv9/e;->v1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/e$a;->b(Ljava/lang/String;)Lv9/e$a;

    iget-boolean v1, p0, Lv9/e;->e:Z

    invoke-virtual {v0, v1}, Lv9/e$a;->d(Z)Lv9/e$a;

    iget v1, p0, Lv9/e;->f:I

    invoke-virtual {v0, v1}, Lv9/e$a;->g(I)Lv9/e$a;

    iget-object p0, p0, Lv9/e;->c:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lv9/e$a;->f(Ljava/lang/String;)Lv9/e$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv9/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv9/e;

    iget-object v0, p0, Lv9/e;->a:Ljava/lang/String;

    iget-object v2, p1, Lv9/e;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/e;->d:Ljava/lang/String;

    iget-object v2, p1, Lv9/e;->d:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/e;->b:Ljava/lang/String;

    iget-object v2, p1, Lv9/e;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lv9/e;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v2, p1, Lv9/e;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lv9/e;->f:I

    iget p1, p1, Lv9/e;->f:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lv9/e;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lv9/e;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lv9/e;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-boolean v1, p0, Lv9/e;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lv9/e;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public v1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public w1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lv9/e;->x1()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lv9/e;->v1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v1, p0, Lv9/e;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lv9/e;->w1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lv9/e;->y1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    iget v1, p0, Lv9/e;->f:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public y1()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lv9/e;->e:Z

    return v0
.end method
