.class public Lqa/e0;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqa/e0$a;,
        Lqa/e0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/e0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lqa/e0;

.field public static final d:Lqa/e0;


# instance fields
.field private final a:Lqa/e0$a;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqa/d1;

    invoke-direct {v0}, Lqa/d1;-><init>()V

    sput-object v0, Lqa/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lqa/e0;

    sget-object v1, Lqa/e0$a;->SUPPORTED:Lqa/e0$a;

    invoke-virtual {v1}, Lqa/e0$a;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqa/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqa/e0;->c:Lqa/e0;

    new-instance v0, Lqa/e0;

    sget-object v1, Lqa/e0$a;->NOT_SUPPORTED:Lqa/e0$a;

    invoke-virtual {v1}, Lqa/e0$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lqa/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqa/e0;->d:Lqa/e0;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p1}, Lqa/e0$a;->b(Ljava/lang/String;)Lqa/e0$a;

    move-result-object p1

    iput-object p1, p0, Lqa/e0;->a:Lqa/e0$a;
    :try_end_0
    .catch Lqa/e0$b; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lqa/e0;->b:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/e0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/e0;

    iget-object v0, p0, Lqa/e0;->a:Lqa/e0$a;

    iget-object v2, p1, Lqa/e0;->a:Lqa/e0$a;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/fido/zzal;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/e0;->b:Ljava/lang/String;

    iget-object p1, p1, Lqa/e0;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/fido/zzal;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

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

    iget-object v2, p0, Lqa/e0;->a:Lqa/e0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/e0;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public v1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0;->a:Lqa/e0$a;

    invoke-virtual {v0}, Lqa/e0$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lqa/e0;->v1()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lqa/e0;->u1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
