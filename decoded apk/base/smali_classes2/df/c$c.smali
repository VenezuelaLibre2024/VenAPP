.class final Ldf/c$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$c;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$c;

    invoke-direct {v0}, Ldf/c$c;-><init>()V

    sput-object v0, Ldf/c$c;->a:Ldf/c$c;

    const-string v0, "performance"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$c;->b:Ljd/c;

    const-string v0, "crashlytics"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$c;->c:Ljd/c;

    const-string v0, "sessionSamplingRate"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$c;->d:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/e;Ljd/e;)V
    .locals 3

    sget-object v0, Ldf/c$c;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/e;->b()Ldf/d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$c;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/e;->a()Ldf/d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$c;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/e;->c()D

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;D)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/e;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$c;->a(Ldf/e;Ljd/e;)V

    return-void
.end method
