.class public Loc/d;
.super Lcom/google/firebase/auth/a0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Loc/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

.field private b:Loc/y1;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loc/y1;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/Boolean;

.field private t:Loc/f;

.field private u:Z

.field private v:Lcom/google/firebase/auth/d2;

.field private w:Loc/l0;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loc/g;

    invoke-direct {v0}, Loc/g;-><init>()V

    sput-object v0, Loc/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;Loc/y1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Loc/f;ZLcom/google/firebase/auth/d2;Loc/l0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafn;",
            "Loc/y1;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Loc/y1;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Loc/f;",
            "Z",
            "Lcom/google/firebase/auth/d2;",
            "Loc/l0;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafq;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/a0;-><init>()V

    iput-object p1, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iput-object p2, p0, Loc/d;->b:Loc/y1;

    iput-object p3, p0, Loc/d;->c:Ljava/lang/String;

    iput-object p4, p0, Loc/d;->d:Ljava/lang/String;

    iput-object p5, p0, Loc/d;->e:Ljava/util/List;

    iput-object p6, p0, Loc/d;->f:Ljava/util/List;

    iput-object p7, p0, Loc/d;->r:Ljava/lang/String;

    iput-object p8, p0, Loc/d;->s:Ljava/lang/Boolean;

    iput-object p9, p0, Loc/d;->t:Loc/f;

    iput-boolean p10, p0, Loc/d;->u:Z

    iput-object p11, p0, Loc/d;->v:Lcom/google/firebase/auth/d2;

    iput-object p12, p0, Loc/d;->w:Loc/l0;

    iput-object p13, p0, Loc/d;->x:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lzb/g;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/c1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/a0;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lzb/g;->q()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Loc/d;->c:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, Loc/d;->d:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Loc/d;->r:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/google/firebase/auth/a0;->P1(Ljava/util/List;)Lcom/google/firebase/auth/a0;

    return-void
.end method


# virtual methods
.method public A1()Z
    .locals 3

    iget-object v0, p0, Loc/d;->s:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Loc/h0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/auth/c0;->e()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->y1()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_2

    if-eqz v1, :cond_3

    const-string v0, "custom"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Loc/d;->s:Ljava/lang/Boolean;

    :cond_4
    iget-object v0, p0, Loc/d;->s:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public B0()Z
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->B0()Z

    move-result v0

    return v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->E()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized P1(Ljava/util/List;)Lcom/google/firebase/auth/a0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/c1;",
            ">;)",
            "Lcom/google/firebase/auth/a0;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Loc/d;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Loc/d;->f:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/c1;

    invoke-interface {v2}, Lcom/google/firebase/auth/c1;->q()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Loc/y1;

    iput-object v3, p0, Loc/d;->b:Loc/y1;

    goto :goto_1

    :cond_0
    iget-object v3, p0, Loc/d;->f:Ljava/util/List;

    invoke-interface {v2}, Lcom/google/firebase/auth/c1;->q()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, Loc/d;->e:Ljava/util/List;

    check-cast v2, Loc/y1;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Loc/d;->b:Loc/y1;

    if-nez p1, :cond_2

    iget-object p1, p0, Loc/d;->e:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loc/y1;

    iput-object p1, p0, Loc/d;->b:Loc/y1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final Q1()Lzb/g;
    .locals 1

    iget-object v0, p0, Loc/d;->c:Ljava/lang/String;

    invoke-static {v0}, Lzb/g;->p(Ljava/lang/String;)Lzb/g;

    move-result-object v0

    return-object v0
.end method

.method public R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final R1(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    iput-object p1, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    return-void
.end method

.method public final synthetic S1()Lcom/google/firebase/auth/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Loc/d;->s:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final T1(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/j0;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Loc/l0;->v1(Ljava/util/List;)Loc/l0;

    move-result-object p1

    iput-object p1, p0, Loc/d;->w:Loc/l0;

    return-void
.end method

.method public final U1()Lcom/google/android/gms/internal/firebase-auth-api/zzafn;
    .locals 1

    iget-object v0, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    return-object v0
.end method

.method public final V1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loc/d;->f:Ljava/util/List;

    return-object v0
.end method

.method public final W1(Ljava/lang/String;)Loc/d;
    .locals 0

    iput-object p1, p0, Loc/d;->r:Ljava/lang/String;

    return-object p0
.end method

.method public final X1(Lcom/google/firebase/auth/d2;)V
    .locals 0

    iput-object p1, p0, Loc/d;->v:Lcom/google/firebase/auth/d2;

    return-void
.end method

.method public final Y1(Loc/f;)V
    .locals 0

    iput-object p1, p0, Loc/d;->t:Loc/f;

    return-void
.end method

.method public final Z1(Z)V
    .locals 0

    iput-boolean p1, p0, Loc/d;->u:Z

    return-void
.end method

.method public final a2(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafq;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Loc/d;->x:Ljava/util/List;

    return-void
.end method

.method public final b2()Lcom/google/firebase/auth/d2;
    .locals 1

    iget-object v0, p0, Loc/d;->v:Lcom/google/firebase/auth/d2;

    return-object v0
.end method

.method public final c2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loc/y1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loc/d;->e:Ljava/util/List;

    return-object v0
.end method

.method public final d2()Z
    .locals 1

    iget-boolean v0, p0, Loc/d;->u:Z

    return v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v0()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Loc/d;->b:Loc/y1;

    invoke-virtual {v0}, Loc/y1;->v0()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public w1()Lcom/google/firebase/auth/b0;
    .locals 1

    iget-object v0, p0, Loc/d;->t:Loc/f;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->U1()Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Loc/d;->b:Loc/y1;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Loc/d;->c:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Loc/d;->d:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x5

    iget-object v2, p0, Loc/d;->e:Ljava/util/List;

    invoke-static {p1, v1, v2, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->V1()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->I(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x7

    iget-object v2, p0, Loc/d;->r:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->A1()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Lea/c;->i(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->w1()Lcom/google/firebase/auth/b0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Loc/d;->u:Z

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v1, 0xb

    iget-object v2, p0, Loc/d;->v:Lcom/google/firebase/auth/d2;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xc

    iget-object v2, p0, Loc/d;->w:Loc/l0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xd

    iget-object v1, p0, Loc/d;->x:Ljava/util/List;

    invoke-static {p1, p2, v1, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public synthetic x1()Lcom/google/firebase/auth/h0;
    .locals 1

    new-instance v0, Loc/h;

    invoke-direct {v0, p0}, Loc/h;-><init>(Loc/d;)V

    return-object v0
.end method

.method public y1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/c1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loc/d;->e:Ljava/util/List;

    return-object v0
.end method

.method public z1()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Loc/h0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/c0;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "firebase"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "tenant"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/a0;->U1()Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/d;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzafn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/j0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loc/d;->w:Loc/l0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Loc/l0;->u1()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
