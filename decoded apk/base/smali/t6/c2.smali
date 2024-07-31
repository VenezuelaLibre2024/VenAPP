.class public final Lt6/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/c2$j;,
        Lt6/c2$e;,
        Lt6/c2$d;,
        Lt6/c2$k;,
        Lt6/c2$l;,
        Lt6/c2$g;,
        Lt6/c2$i;,
        Lt6/c2$h;,
        Lt6/c2$b;,
        Lt6/c2$f;,
        Lt6/c2$c;
    }
.end annotation


# static fields
.field public static final t:Lt6/c2;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field public static final z:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/c2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lt6/c2$h;

.field public final c:Lt6/c2$i;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:Lt6/c2$g;

.field public final e:Lt6/h2;

.field public final f:Lt6/c2$d;

.field public final r:Lt6/c2$e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final s:Lt6/c2$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/c2$c;

    invoke-direct {v0}, Lt6/c2$c;-><init>()V

    invoke-virtual {v0}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object v0

    sput-object v0, Lt6/c2;->t:Lt6/c2;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2;->u:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2;->v:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2;->w:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2;->x:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/c2;->y:Ljava/lang/String;

    new-instance v0, Lt6/b2;

    invoke-direct {v0}, Lt6/b2;-><init>()V

    sput-object v0, Lt6/c2;->z:Lt6/o$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lt6/c2$e;Lt6/c2$i;Lt6/c2$g;Lt6/h2;Lt6/c2$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/c2;->a:Ljava/lang/String;

    iput-object p3, p0, Lt6/c2;->b:Lt6/c2$h;

    iput-object p3, p0, Lt6/c2;->c:Lt6/c2$i;

    iput-object p4, p0, Lt6/c2;->d:Lt6/c2$g;

    iput-object p5, p0, Lt6/c2;->e:Lt6/h2;

    iput-object p2, p0, Lt6/c2;->f:Lt6/c2$d;

    iput-object p2, p0, Lt6/c2;->r:Lt6/c2$e;

    iput-object p6, p0, Lt6/c2;->s:Lt6/c2$j;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lt6/c2$e;Lt6/c2$i;Lt6/c2$g;Lt6/h2;Lt6/c2$j;Lt6/c2$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lt6/c2;-><init>(Ljava/lang/String;Lt6/c2$e;Lt6/c2$i;Lt6/c2$g;Lt6/h2;Lt6/c2$j;)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/c2;
    .locals 0

    invoke-static {p0}, Lt6/c2;->d(Landroid/os/Bundle;)Lt6/c2;

    move-result-object p0

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)Lt6/c2;
    .locals 8

    sget-object v0, Lt6/c2;->u:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    sget-object v0, Lt6/c2;->v:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lt6/c2$g;->f:Lt6/c2$g;

    goto :goto_0

    :cond_0
    sget-object v1, Lt6/c2$g;->w:Lt6/o$a;

    invoke-interface {v1, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lt6/c2$g;

    :goto_0
    move-object v5, v0

    sget-object v0, Lt6/c2;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lt6/h2;->T:Lt6/h2;

    goto :goto_1

    :cond_1
    sget-object v1, Lt6/h2;->B0:Lt6/o$a;

    invoke-interface {v1, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lt6/h2;

    :goto_1
    move-object v6, v0

    sget-object v0, Lt6/c2;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lt6/c2$e;->x:Lt6/c2$e;

    goto :goto_2

    :cond_2
    sget-object v1, Lt6/c2$d;->w:Lt6/o$a;

    invoke-interface {v1, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lt6/c2$e;

    :goto_2
    move-object v3, v0

    sget-object v0, Lt6/c2;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_3

    sget-object p0, Lt6/c2$j;->d:Lt6/c2$j;

    goto :goto_3

    :cond_3
    sget-object v0, Lt6/c2$j;->s:Lt6/o$a;

    invoke-interface {v0, p0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object p0

    check-cast p0, Lt6/c2$j;

    :goto_3
    move-object v7, p0

    new-instance p0, Lt6/c2;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lt6/c2;-><init>(Ljava/lang/String;Lt6/c2$e;Lt6/c2$i;Lt6/c2$g;Lt6/h2;Lt6/c2$j;)V

    return-object p0
.end method

.method public static e(Landroid/net/Uri;)Lt6/c2;
    .locals 1

    new-instance v0, Lt6/c2$c;

    invoke-direct {v0}, Lt6/c2$c;-><init>()V

    invoke-virtual {v0, p0}, Lt6/c2$c;->g(Landroid/net/Uri;)Lt6/c2$c;

    move-result-object p0

    invoke-virtual {p0}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;)Lt6/c2;
    .locals 1

    new-instance v0, Lt6/c2$c;

    invoke-direct {v0}, Lt6/c2$c;-><init>()V

    invoke-virtual {v0, p0}, Lt6/c2$c;->h(Ljava/lang/String;)Lt6/c2$c;

    move-result-object p0

    invoke-virtual {p0}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lt6/c2;->a:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lt6/c2;->u:Ljava/lang/String;

    iget-object v2, p0, Lt6/c2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lt6/c2;->d:Lt6/c2$g;

    sget-object v2, Lt6/c2$g;->f:Lt6/c2$g;

    invoke-virtual {v1, v2}, Lt6/c2$g;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lt6/c2;->v:Ljava/lang/String;

    iget-object v2, p0, Lt6/c2;->d:Lt6/c2$g;

    invoke-virtual {v2}, Lt6/c2$g;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v1, p0, Lt6/c2;->e:Lt6/h2;

    sget-object v2, Lt6/h2;->T:Lt6/h2;

    invoke-virtual {v1, v2}, Lt6/h2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lt6/c2;->w:Ljava/lang/String;

    iget-object v2, p0, Lt6/c2;->e:Lt6/h2;

    invoke-virtual {v2}, Lt6/h2;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    iget-object v1, p0, Lt6/c2;->f:Lt6/c2$d;

    sget-object v2, Lt6/c2$d;->f:Lt6/c2$d;

    invoke-virtual {v1, v2}, Lt6/c2$d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lt6/c2;->x:Ljava/lang/String;

    iget-object v2, p0, Lt6/c2;->f:Lt6/c2$d;

    invoke-virtual {v2}, Lt6/c2$d;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iget-object v1, p0, Lt6/c2;->s:Lt6/c2$j;

    sget-object v2, Lt6/c2$j;->d:Lt6/c2$j;

    invoke-virtual {v1, v2}, Lt6/c2$j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lt6/c2;->y:Ljava/lang/String;

    iget-object v2, p0, Lt6/c2;->s:Lt6/c2$j;

    invoke-virtual {v2}, Lt6/c2$j;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    return-object v0
.end method

.method public c()Lt6/c2$c;
    .locals 2

    new-instance v0, Lt6/c2$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/c2$c;-><init>(Lt6/c2;Lt6/c2$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt6/c2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt6/c2;

    iget-object v1, p0, Lt6/c2;->a:Ljava/lang/String;

    iget-object v3, p1, Lt6/c2;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt6/c2;->f:Lt6/c2$d;

    iget-object v3, p1, Lt6/c2;->f:Lt6/c2$d;

    invoke-virtual {v1, v3}, Lt6/c2$d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt6/c2;->b:Lt6/c2$h;

    iget-object v3, p1, Lt6/c2;->b:Lt6/c2$h;

    invoke-static {v1, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt6/c2;->d:Lt6/c2$g;

    iget-object v3, p1, Lt6/c2;->d:Lt6/c2$g;

    invoke-static {v1, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt6/c2;->e:Lt6/h2;

    iget-object v3, p1, Lt6/c2;->e:Lt6/h2;

    invoke-static {v1, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lt6/c2;->s:Lt6/c2$j;

    iget-object p1, p1, Lt6/c2;->s:Lt6/c2$j;

    invoke-static {v1, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lt6/c2;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/c2;->b:Lt6/c2$h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lt6/c2$h;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/c2;->d:Lt6/c2$g;

    invoke-virtual {v1}, Lt6/c2$g;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/c2;->f:Lt6/c2$d;

    invoke-virtual {v1}, Lt6/c2$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/c2;->e:Lt6/h2;

    invoke-virtual {v1}, Lt6/h2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/c2;->s:Lt6/c2$j;

    invoke-virtual {v1}, Lt6/c2$j;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
