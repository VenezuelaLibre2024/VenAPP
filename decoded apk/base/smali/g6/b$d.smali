.class final Lg6/b$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lg6/l;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg6/b$d;

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

    new-instance v0, Lg6/b$d;

    invoke-direct {v0}, Lg6/b$d;-><init>()V

    sput-object v0, Lg6/b$d;->a:Lg6/b$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->b:Ljd/c;

    const-string v0, "eventCode"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->c:Ljd/c;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->d:Ljd/c;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->e:Ljd/c;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->f:Ljd/c;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->g:Ljd/c;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$d;->h:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg6/l;Ljd/e;)V
    .locals 3

    sget-object v0, Lg6/b$d;->b:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lg6/b$d;->c:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$d;->d:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lg6/b$d;->e:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$d;->f:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$d;->g:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lg6/b$d;->h:Ljd/c;

    invoke-virtual {p1}, Lg6/l;->e()Lg6/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg6/l;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lg6/b$d;->a(Lg6/l;Ljd/e;)V

    return-void
.end method
