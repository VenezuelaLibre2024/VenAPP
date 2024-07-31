.class public Lpb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpb/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljb/w<",
        "Ljb/e;",
        "Ljb/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:Lpb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lpb/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lpb/c;->a:Ljava/util/logging/Logger;

    new-instance v0, Lpb/c;

    invoke-direct {v0}, Lpb/c;-><init>()V

    sput-object v0, Lpb/c;->b:Lpb/c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lpb/c;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static e()V
    .locals 1

    sget-object v0, Lpb/c;->b:Lpb/c;

    invoke-static {v0}, Ljb/x;->n(Ljb/w;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljb/v;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpb/c;->f(Ljb/v;)Ljb/e;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljb/e;",
            ">;"
        }
    .end annotation

    const-class v0, Ljb/e;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljb/e;",
            ">;"
        }
    .end annotation

    const-class v0, Ljb/e;

    return-object v0
.end method

.method public f(Ljb/v;)Ljb/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Ljb/e;",
            ">;)",
            "Ljb/e;"
        }
    .end annotation

    new-instance v0, Lpb/c$a;

    invoke-direct {v0, p1}, Lpb/c$a;-><init>(Ljb/v;)V

    return-object v0
.end method
