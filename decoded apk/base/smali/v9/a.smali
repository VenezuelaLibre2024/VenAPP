.class public final Lv9/a;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv9/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private final e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field private final f:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/m;

    invoke-direct {v0}, Lv9/m;-><init>()V

    sput-object v0, Lv9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Landroid/app/PendingIntent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            "Landroid/app/PendingIntent;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lv9/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lv9/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lv9/a;->c:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lv9/a;->d:Ljava/util/List;

    iput-object p6, p0, Lv9/a;->f:Landroid/app/PendingIntent;

    iput-object p5, p0, Lv9/a;->e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv9/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv9/a;

    iget-object v0, p0, Lv9/a;->a:Ljava/lang/String;

    iget-object v2, p1, Lv9/a;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/a;->b:Ljava/lang/String;

    iget-object v2, p1, Lv9/a;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/a;->c:Ljava/lang/String;

    iget-object v2, p1, Lv9/a;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/a;->d:Ljava/util/List;

    iget-object v2, p1, Lv9/a;->d:Ljava/util/List;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/a;->f:Landroid/app/PendingIntent;

    iget-object v2, p1, Lv9/a;->f:Landroid/app/PendingIntent;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv9/a;->e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object p1, p1, Lv9/a;->e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

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

    iget-object v2, p0, Lv9/a;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lv9/a;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lv9/a;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lv9/a;->d:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lv9/a;->f:Landroid/app/PendingIntent;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lv9/a;->e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public v1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv9/a;->d:Ljava/util/List;

    return-object v0
.end method

.method public w1()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lv9/a;->f:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lv9/a;->x1()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lv9/a;->u1()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lv9/a;->c:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lv9/a;->v1()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lv9/a;->y1()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lv9/a;->w1()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv9/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public y1()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 1

    iget-object v0, p0, Lv9/a;->e:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object v0
.end method
