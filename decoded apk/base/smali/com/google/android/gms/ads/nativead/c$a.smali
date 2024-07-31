.class public final Lcom/google/android/gms/ads/nativead/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/nativead/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:Lx8/c0;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->a:Z

    iput v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->b:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->c:Z

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/gms/ads/nativead/c$a;->e:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->f:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->g:Z

    iput v0, p0, Lcom/google/android/gms/ads/nativead/c$a;->h:I

    iput v1, p0, Lcom/google/android/gms/ads/nativead/c$a;->i:I

    return-void
.end method

.method static bridge synthetic i(Lcom/google/android/gms/ads/nativead/c$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->e:I

    return p0
.end method

.method static bridge synthetic j(Lcom/google/android/gms/ads/nativead/c$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->h:I

    return p0
.end method

.method static bridge synthetic k(Lcom/google/android/gms/ads/nativead/c$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->b:I

    return p0
.end method

.method static bridge synthetic l(Lcom/google/android/gms/ads/nativead/c$a;)Lx8/c0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->d:Lx8/c0;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/google/android/gms/ads/nativead/c$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->g:Z

    return p0
.end method

.method static bridge synthetic n(Lcom/google/android/gms/ads/nativead/c$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->c:Z

    return p0
.end method

.method static bridge synthetic o(Lcom/google/android/gms/ads/nativead/c$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->a:Z

    return p0
.end method

.method static bridge synthetic p(Lcom/google/android/gms/ads/nativead/c$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->f:Z

    return p0
.end method

.method static bridge synthetic r(Lcom/google/android/gms/ads/nativead/c$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/nativead/c$a;->i:I

    return p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/nativead/c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/nativead/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/nativead/c;-><init>(Lcom/google/android/gms/ads/nativead/c$a;Lcom/google/android/gms/ads/nativead/e;)V

    return-object v0
.end method

.method public b(IZ)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput-boolean p2, p0, Lcom/google/android/gms/ads/nativead/c$a;->g:Z

    iput p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->h:I

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->e:I

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->b:I

    return-object p0
.end method

.method public e(Z)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->f:Z

    return-object p0
.end method

.method public f(Z)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->c:Z

    return-object p0
.end method

.method public g(Z)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->a:Z

    return-object p0
.end method

.method public h(Lx8/c0;)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->d:Lx8/c0;

    return-object p0
.end method

.method public final q(I)Lcom/google/android/gms/ads/nativead/c$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/nativead/c$a;->i:I

    return-object p0
.end method
