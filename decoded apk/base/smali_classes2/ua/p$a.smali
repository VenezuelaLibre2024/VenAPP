.class public Lua/p$a;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/p$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lua/b;

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/p0;

    invoke-direct {v0}, Lua/p0;-><init>()V

    sput-object v0, Lua/p$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Landroid/os/IBinder;II)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    const v0, -0x4cebee

    iput v0, p0, Lua/p$a;->c:I

    const/high16 v0, -0x1000000

    iput v0, p0, Lua/p$a;->d:I

    iput-object p1, p0, Lua/p$a;->a:Ljava/lang/String;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lua/b;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    invoke-direct {p1, p2}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V

    :goto_0
    iput-object p1, p0, Lua/p$a;->b:Lua/b;

    iput p3, p0, Lua/p$a;->c:I

    iput p4, p0, Lua/p$a;->d:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lua/p$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lua/p$a;

    iget v1, p0, Lua/p$a;->c:I

    iget v3, p1, Lua/p$a;->c:I

    if-ne v1, v3, :cond_7

    iget-object v1, p0, Lua/p$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lua/p$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lua/v0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, p0, Lua/p$a;->d:I

    iget v3, p1, Lua/p$a;->d:I

    if-eq v1, v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lua/p$a;->b:Lua/b;

    if-nez v1, :cond_3

    iget-object v3, p1, Lua/p$a;->b:Lua/b;

    if-nez v3, :cond_4

    :cond_3
    if-eqz v1, :cond_5

    iget-object v3, p1, Lua/p$a;->b:Lua/b;

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_0
    iget-object p1, p1, Lua/p$a;->b:Lua/b;

    if-eqz v1, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lua/v0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    return v0

    :cond_7
    :goto_1
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lua/p$a;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lua/p$a;->b:Lua/b;

    aput-object v2, v0, v1

    iget v1, p0, Lua/p$a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()I
    .locals 1

    iget v0, p0, Lua/p$a;->c:I

    return v0
.end method

.method public v1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lua/p$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public w1()I
    .locals 1

    iget v0, p0, Lua/p$a;->d:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lua/p$a;->v1()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lua/p$a;->b:Lua/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lua/p$a;->u1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lua/p$a;->w1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
