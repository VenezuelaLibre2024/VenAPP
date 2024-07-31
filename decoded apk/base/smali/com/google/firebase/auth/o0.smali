.class public Lcom/google/firebase/auth/o0;
.super Lcom/google/firebase/auth/h;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/o0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/s1;

    invoke-direct {v0}, Lcom/google/firebase/auth/s1;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/o0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/firebase/auth/h;-><init>()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/s;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/firebase/auth/o0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/o0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/o0;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/firebase/auth/o0;->d:Z

    iput-object p5, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    return-void
.end method

.method public static A1(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/o0;
    .locals 7

    new-instance v6, Lcom/google/firebase/auth/o0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object v0, v6

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method

.method public static y1(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/o0;
    .locals 7

    new-instance v6, Lcom/google/firebase/auth/o0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lcom/google/firebase/auth/o0;

    iget-object v1, p0, Lcom/google/firebase/auth/o0;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/firebase/auth/o0;->x1()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/auth/o0;->c:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/google/firebase/auth/o0;->d:Z

    iget-object v5, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public v1()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public final w1()Lcom/google/firebase/auth/h;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/o0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/o0;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->a:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/google/firebase/auth/o0;->x1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/firebase/auth/o0;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/google/firebase/auth/o0;->d:Z

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final z1(Z)Lcom/google/firebase/auth/o0;
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/firebase/auth/o0;->d:Z

    return-object p0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/o0;->d:Z

    return v0
.end method
