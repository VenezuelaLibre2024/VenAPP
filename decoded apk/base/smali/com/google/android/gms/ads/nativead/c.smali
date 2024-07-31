.class public final Lcom/google/android/gms/ads/nativead/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/nativead/c$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Z

.field private final d:I

.field private final e:Lx8/c0;

.field private final f:Z

.field private final g:Z

.field private final h:I

.field private final i:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/ads/nativead/c$a;Lcom/google/android/gms/ads/nativead/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->o(Lcom/google/android/gms/ads/nativead/c$a;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/ads/nativead/c;->a:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->k(Lcom/google/android/gms/ads/nativead/c$a;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/ads/nativead/c;->b:I

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->n(Lcom/google/android/gms/ads/nativead/c$a;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/ads/nativead/c;->c:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->i(Lcom/google/android/gms/ads/nativead/c$a;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/ads/nativead/c;->d:I

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->l(Lcom/google/android/gms/ads/nativead/c$a;)Lx8/c0;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/ads/nativead/c;->e:Lx8/c0;

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->p(Lcom/google/android/gms/ads/nativead/c$a;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/ads/nativead/c;->f:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->m(Lcom/google/android/gms/ads/nativead/c$a;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/ads/nativead/c;->g:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->j(Lcom/google/android/gms/ads/nativead/c$a;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/ads/nativead/c;->h:I

    invoke-static {p1}, Lcom/google/android/gms/ads/nativead/c$a;->r(Lcom/google/android/gms/ads/nativead/c$a;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/ads/nativead/c;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/nativead/c;->d:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/nativead/c;->b:I

    return v0
.end method

.method public c()Lx8/c0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/c;->e:Lx8/c0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c;->c:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c;->a:Z

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/nativead/c;->h:I

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c;->g:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c;->f:Z

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/nativead/c;->i:I

    return v0
.end method
