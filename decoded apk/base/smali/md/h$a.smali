.class public final Lmd/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkd/b<",
        "Lmd/h$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmd/g;

    invoke-direct {v0}, Lmd/g;-><init>()V

    sput-object v0, Lmd/h$a;->d:Ljd/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lmd/h$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lmd/h$a;->b:Ljava/util/Map;

    sget-object v0, Lmd/h$a;->d:Ljd/d;

    iput-object v0, p0, Lmd/h$a;->c:Ljd/d;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljd/e;)V
    .locals 0

    invoke-static {p0, p1}, Lmd/h$a;->d(Ljava/lang/Object;Ljd/e;)V

    return-void
.end method

.method private static synthetic d(Ljava/lang/Object;Ljd/e;)V
    .locals 2

    new-instance p1, Ljd/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()Lmd/h;
    .locals 4

    new-instance v0, Lmd/h;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lmd/h$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lmd/h$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Lmd/h$a;->c:Ljd/d;

    invoke-direct {v0, v1, v2, v3}, Lmd/h;-><init>(Ljava/util/Map;Ljava/util/Map;Ljd/d;)V

    return-object v0
.end method

.method public c(Lkd/a;)Lmd/h$a;
    .locals 0

    invoke-interface {p1, p0}, Lkd/a;->configure(Lkd/b;)V

    return-object p0
.end method

.method public e(Ljava/lang/Class;Ljd/d;)Lmd/h$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Ljd/d<",
            "-TU;>;)",
            "Lmd/h$a;"
        }
    .end annotation

    iget-object v0, p0, Lmd/h$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lmd/h$a;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmd/h$a;->e(Ljava/lang/Class;Ljd/d;)Lmd/h$a;

    move-result-object p1

    return-object p1
.end method
