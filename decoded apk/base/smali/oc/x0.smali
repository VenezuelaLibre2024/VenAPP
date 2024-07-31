.class public final Loc/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile a:I

.field private final b:Loc/s;

.field private volatile c:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Loc/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Loc/x0;->c:Z

    iput v0, p0, Loc/x0;->a:I

    iput-object p2, p0, Loc/x0;->b:Loc/s;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->b()Lcom/google/android/gms/common/api/internal/c;

    move-result-object p1

    new-instance p2, Loc/a1;

    invoke-direct {p2, p0}, Loc/a1;-><init>(Loc/x0;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/internal/c;->a(Lcom/google/android/gms/common/api/internal/c$a;)V

    return-void
.end method

.method public constructor <init>(Lzb/g;)V
    .locals 2

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Loc/s;

    invoke-direct {v1, p1}, Loc/s;-><init>(Lzb/g;)V

    invoke-direct {p0, v0, v1}, Loc/x0;-><init>(Landroid/content/Context;Loc/s;)V

    return-void
.end method

.method static bridge synthetic a(Loc/x0;)Loc/s;
    .locals 0

    iget-object p0, p0, Loc/x0;->b:Loc/s;

    return-object p0
.end method

.method static bridge synthetic d(Loc/x0;Z)V
    .locals 0

    iput-boolean p1, p0, Loc/x0;->c:Z

    return-void
.end method

.method private final e()Z
    .locals 1

    iget v0, p0, Loc/x0;->a:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, Loc/x0;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static bridge synthetic f(Loc/x0;)Z
    .locals 0

    invoke-direct {p0}, Loc/x0;->e()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Loc/x0;->b:Loc/s;

    invoke-virtual {v0}, Loc/s;->b()V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/zzafn;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zza()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    const-wide/16 v0, 0xe10

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafn;->zzb()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    add-long/2addr v2, v0

    iget-object p1, p0, Loc/x0;->b:Loc/s;

    iput-wide v2, p1, Loc/s;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p1, Loc/s;->c:J

    invoke-direct {p0}, Loc/x0;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Loc/x0;->b:Loc/s;

    invoke-virtual {p1}, Loc/s;->c()V

    :cond_2
    return-void
.end method
