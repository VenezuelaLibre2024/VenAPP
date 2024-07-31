.class final Lg6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lg6/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg6/b$a;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;

.field private static final i:Ljd/c;

.field private static final j:Ljd/c;

.field private static final k:Ljd/c;

.field private static final l:Ljd/c;

.field private static final m:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b$a;

    invoke-direct {v0}, Lg6/b$a;-><init>()V

    sput-object v0, Lg6/b$a;->a:Lg6/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->b:Ljd/c;

    const-string v0, "model"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->c:Ljd/c;

    const-string v0, "hardware"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->d:Ljd/c;

    const-string v0, "device"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->e:Ljd/c;

    const-string v0, "product"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->f:Ljd/c;

    const-string v0, "osBuild"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->g:Ljd/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->h:Ljd/c;

    const-string v0, "fingerprint"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->i:Ljd/c;

    const-string v0, "locale"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->j:Ljd/c;

    const-string v0, "country"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->k:Ljd/c;

    const-string v0, "mccMnc"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->l:Ljd/c;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$a;->m:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg6/a;Ljd/e;)V
    .locals 2

    sget-object v0, Lg6/b$a;->b:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->c:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->d:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->e:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->f:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->g:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->h:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->i:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->j:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->k:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->l:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$a;->m:Ljd/c;

    invoke-virtual {p1}, Lg6/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg6/a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lg6/b$a;->a(Lg6/a;Ljd/e;)V

    return-void
.end method
