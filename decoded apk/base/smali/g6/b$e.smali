.class final Lg6/b$e;
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
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lg6/m;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg6/b$e;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b$e;

    invoke-direct {v0}, Lg6/b$e;-><init>()V

    sput-object v0, Lg6/b$e;->a:Lg6/b$e;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->b:Ljd/c;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->c:Ljd/c;

    const-string v0, "clientInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->d:Ljd/c;

    const-string v0, "logSource"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->e:Ljd/c;

    const-string v0, "logSourceName"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->f:Ljd/c;

    const-string v0, "logEvent"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->g:Ljd/c;

    const-string v0, "qosTier"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$e;->h:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg6/m;Ljd/e;)V
    .locals 3

    sget-object v0, Lg6/b$e;->b:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lg6/b$e;->c:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lg6/b$e;->d:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->b()Lg6/k;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$e;->e:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$e;->f:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$e;->g:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$e;->h:Ljd/c;

    invoke-virtual {p1}, Lg6/m;->f()Lg6/p;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg6/m;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lg6/b$e;->a(Lg6/m;Ljd/e;)V

    return-void
.end method
