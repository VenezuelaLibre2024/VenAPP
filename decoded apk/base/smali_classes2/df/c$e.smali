.class final Ldf/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/z;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$e;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$e;

    invoke-direct {v0}, Ldf/c$e;-><init>()V

    sput-object v0, Ldf/c$e;->a:Ldf/c$e;

    const-string v0, "eventType"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$e;->b:Ljd/c;

    const-string v0, "sessionData"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$e;->c:Ljd/c;

    const-string v0, "applicationInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$e;->d:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/z;Ljd/e;)V
    .locals 2

    sget-object v0, Ldf/c$e;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/z;->b()Ldf/i;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$e;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/z;->c()Ldf/e0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$e;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/z;->a()Ldf/b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/z;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$e;->a(Ldf/z;Ljd/e;)V

    return-void
.end method
