.class public Lqa/k;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lqa/b;

.field private final b:Ljava/lang/Boolean;

.field private final c:Lqa/h1;

.field private final d:Lqa/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/v1;

    invoke-direct {v0}, Lqa/v1;-><init>()V

    sput-object v0, Lqa/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lqa/b;->b(Ljava/lang/String;)Lqa/b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lqa/k;->a:Lqa/b;

    iput-object p2, p0, Lqa/k;->b:Ljava/lang/Boolean;

    if-nez p3, :cond_1

    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-static {p3}, Lqa/h1;->b(Ljava/lang/String;)Lqa/h1;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lqa/k;->c:Lqa/h1;

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p4}, Lqa/d0;->b(Ljava/lang/String;)Lqa/d0;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lqa/k;->d:Lqa/d0;
    :try_end_0
    .catch Lqa/b$a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lqa/g1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lqa/d0$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    :goto_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/k;

    iget-object v0, p0, Lqa/k;->a:Lqa/b;

    iget-object v2, p1, Lqa/k;->a:Lqa/b;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/k;->b:Ljava/lang/Boolean;

    iget-object v2, p1, Lqa/k;->b:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/k;->c:Lqa/h1;

    iget-object v2, p1, Lqa/k;->c:Lqa/h1;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/k;->d:Lqa/d0;

    iget-object p1, p1, Lqa/k;->d:Lqa/d0;

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

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lqa/k;->a:Lqa/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/k;->b:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lqa/k;->c:Lqa/h1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/k;->d:Lqa/d0;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/k;->a:Lqa/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lqa/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lqa/k;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public w1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/k;->d:Lqa/d0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lqa/d0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lqa/k;->u1()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lqa/k;->v1()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->i(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    iget-object v0, p0, Lqa/k;->c:Lqa/h1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lqa/h1;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lqa/k;->w1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
