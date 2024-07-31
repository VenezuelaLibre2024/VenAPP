.class public Lt6/c2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/c2$d$a;
    }
.end annotation


# static fields
.field public static final f:Lt6/c2$d;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field public static final w:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/c2$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/c2$d$a;

    invoke-direct {v0}, Lt6/c2$d$a;-><init>()V

    invoke-virtual {v0}, Lt6/c2$d$a;->f()Lt6/c2$d;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->f:Lt6/c2$d;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->r:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->s:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->t:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->u:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2$d;->v:Ljava/lang/String;

    new-instance v0, Lt6/d2;

    invoke-direct {v0}, Lt6/d2;-><init>()V

    sput-object v0, Lt6/c2$d;->w:Lt6/o$a;

    return-void
.end method

.method private constructor <init>(Lt6/c2$d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt6/c2$d$a;->a(Lt6/c2$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lt6/c2$d;->a:J

    invoke-static {p1}, Lt6/c2$d$a;->b(Lt6/c2$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lt6/c2$d;->b:J

    invoke-static {p1}, Lt6/c2$d$a;->c(Lt6/c2$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lt6/c2$d;->c:Z

    invoke-static {p1}, Lt6/c2$d$a;->d(Lt6/c2$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lt6/c2$d;->d:Z

    invoke-static {p1}, Lt6/c2$d$a;->e(Lt6/c2$d$a;)Z

    move-result p1

    iput-boolean p1, p0, Lt6/c2$d;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2$d$a;Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/c2$d;-><init>(Lt6/c2$d$a;)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/c2$e;
    .locals 0

    invoke-static {p0}, Lt6/c2$d;->d(Landroid/os/Bundle;)Lt6/c2$e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lt6/c2$e;
    .locals 5

    new-instance v0, Lt6/c2$d$a;

    invoke-direct {v0}, Lt6/c2$d$a;-><init>()V

    sget-object v1, Lt6/c2$d;->r:Ljava/lang/String;

    sget-object v2, Lt6/c2$d;->f:Lt6/c2$d;

    iget-wide v3, v2, Lt6/c2$d;->a:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lt6/c2$d$a;->k(J)Lt6/c2$d$a;

    move-result-object v0

    sget-object v1, Lt6/c2$d;->s:Ljava/lang/String;

    iget-wide v3, v2, Lt6/c2$d;->b:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lt6/c2$d$a;->h(J)Lt6/c2$d$a;

    move-result-object v0

    sget-object v1, Lt6/c2$d;->t:Ljava/lang/String;

    iget-boolean v3, v2, Lt6/c2$d;->c:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lt6/c2$d$a;->j(Z)Lt6/c2$d$a;

    move-result-object v0

    sget-object v1, Lt6/c2$d;->u:Ljava/lang/String;

    iget-boolean v3, v2, Lt6/c2$d;->d:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lt6/c2$d$a;->i(Z)Lt6/c2$d$a;

    move-result-object v0

    sget-object v1, Lt6/c2$d;->v:Ljava/lang/String;

    iget-boolean v2, v2, Lt6/c2$d;->e:Z

    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {v0, p0}, Lt6/c2$d$a;->l(Z)Lt6/c2$d$a;

    move-result-object p0

    invoke-virtual {p0}, Lt6/c2$d$a;->g()Lt6/c2$e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-wide v1, p0, Lt6/c2$d;->a:J

    sget-object v3, Lt6/c2$d;->f:Lt6/c2$d;

    iget-wide v4, v3, Lt6/c2$d;->a:J

    cmp-long v4, v1, v4

    if-eqz v4, :cond_0

    sget-object v4, Lt6/c2$d;->r:Ljava/lang/String;

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-wide v1, p0, Lt6/c2$d;->b:J

    iget-wide v4, v3, Lt6/c2$d;->b:J

    cmp-long v4, v1, v4

    if-eqz v4, :cond_1

    sget-object v4, Lt6/c2$d;->s:Ljava/lang/String;

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    iget-boolean v1, p0, Lt6/c2$d;->c:Z

    iget-boolean v2, v3, Lt6/c2$d;->c:Z

    if-eq v1, v2, :cond_2

    sget-object v2, Lt6/c2$d;->t:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_2
    iget-boolean v1, p0, Lt6/c2$d;->d:Z

    iget-boolean v2, v3, Lt6/c2$d;->d:Z

    if-eq v1, v2, :cond_3

    sget-object v2, Lt6/c2$d;->u:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v1, p0, Lt6/c2$d;->e:Z

    iget-boolean v2, v3, Lt6/c2$d;->e:Z

    if-eq v1, v2, :cond_4

    sget-object v2, Lt6/c2$d;->v:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    return-object v0
.end method

.method public c()Lt6/c2$d$a;
    .locals 2

    new-instance v0, Lt6/c2$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/c2$d$a;-><init>(Lt6/c2$d;Lt6/c2$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt6/c2$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt6/c2$d;

    iget-wide v3, p0, Lt6/c2$d;->a:J

    iget-wide v5, p1, Lt6/c2$d;->a:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lt6/c2$d;->b:J

    iget-wide v5, p1, Lt6/c2$d;->b:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lt6/c2$d;->c:Z

    iget-boolean v3, p1, Lt6/c2$d;->c:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lt6/c2$d;->d:Z

    iget-boolean v3, p1, Lt6/c2$d;->d:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lt6/c2$d;->e:Z

    iget-boolean p1, p1, Lt6/c2$d;->e:Z

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lt6/c2$d;->a:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lt6/c2$d;->b:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lt6/c2$d;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lt6/c2$d;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lt6/c2$d;->e:Z

    add-int/2addr v0, v1

    return v0
.end method
