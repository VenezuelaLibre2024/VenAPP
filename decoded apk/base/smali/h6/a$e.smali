.class final Lh6/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lh6/m;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lh6/a$e;

.field private static final b:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/a$e;

    invoke-direct {v0}, Lh6/a$e;-><init>()V

    sput-object v0, Lh6/a$e;->a:Lh6/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lh6/a$e;->b:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh6/m;Ljd/e;)V
    .locals 1

    sget-object v0, Lh6/a$e;->b:Ljd/c;

    invoke-virtual {p1}, Lh6/m;->b()Lk6/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh6/m;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lh6/a$e;->a(Lh6/m;Ljd/e;)V

    return-void
.end method
