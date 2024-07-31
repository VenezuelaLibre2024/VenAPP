.class public Lv9/g;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv9/g$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv9/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lv9/j;

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/x;

    invoke-direct {v0}, Lv9/x;-><init>()V

    sput-object v0, Lv9/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lv9/j;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/j;

    iput-object p1, p0, Lv9/g;->a:Lv9/j;

    iput-object p2, p0, Lv9/g;->b:Ljava/lang/String;

    iput p3, p0, Lv9/g;->c:I

    return-void
.end method

.method public static u1()Lv9/g$a;
    .locals 1

    new-instance v0, Lv9/g$a;

    invoke-direct {v0}, Lv9/g$a;-><init>()V

    return-object v0
.end method

.method public static w1(Lv9/g;)Lv9/g$a;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lv9/g;->u1()Lv9/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lv9/g;->v1()Lv9/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv9/g$a;->b(Lv9/j;)Lv9/g$a;

    iget v1, p0, Lv9/g;->c:I

    invoke-virtual {v0, v1}, Lv9/g$a;->d(I)Lv9/g$a;

    iget-object p0, p0, Lv9/g;->b:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lv9/g$a;->c(Ljava/lang/String;)Lv9/g$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv9/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv9/g;

    iget-object v0, p0, Lv9/g;->a:Lv9/j;

    iget-object v2, p1, Lv9/g;->a:Lv9/j;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/g;->b:Ljava/lang/String;

    iget-object v2, p1, Lv9/g;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lv9/g;->c:I

    iget p1, p1, Lv9/g;->c:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lv9/g;->a:Lv9/j;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lv9/g;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public v1()Lv9/j;
    .locals 1

    iget-object v0, p0, Lv9/g;->a:Lv9/j;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lv9/g;->v1()Lv9/j;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x2

    iget-object v1, p0, Lv9/g;->b:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget v1, p0, Lv9/g;->c:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
