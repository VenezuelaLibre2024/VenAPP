.class public Lih/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lih/g;


# instance fields
.field private a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ldg/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ldg/a;",
            ">;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih/j;->a:Ljava/util/Collection;

    iput-object p2, p0, Lih/j;->b:Ljava/util/Map;

    iput-object p3, p0, Lih/j;->c:Ljava/lang/String;

    iput p4, p0, Lih/j;->d:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lih/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Lih/f;"
        }
    .end annotation

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ldg/e;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lih/j;->b:Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    iget-object p1, p0, Lih/j;->a:Ljava/util/Collection;

    if-eqz p1, :cond_1

    sget-object v1, Ldg/e;->POSSIBLE_FORMATS:Ldg/e;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lih/j;->c:Ljava/lang/String;

    if-eqz p1, :cond_2

    sget-object v1, Ldg/e;->CHARACTER_SET:Ldg/e;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance p1, Ldg/k;

    invoke-direct {p1}, Ldg/k;-><init>()V

    invoke-virtual {p1, v0}, Ldg/k;->e(Ljava/util/Map;)V

    iget v0, p0, Lih/j;->d:I

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    new-instance v0, Lih/f;

    invoke-direct {v0, p1}, Lih/f;-><init>(Ldg/o;)V

    return-object v0

    :cond_3
    new-instance v0, Lih/l;

    invoke-direct {v0, p1}, Lih/l;-><init>(Ldg/o;)V

    return-object v0

    :cond_4
    new-instance v0, Lih/k;

    invoke-direct {v0, p1}, Lih/k;-><init>(Ldg/o;)V

    return-object v0

    :cond_5
    new-instance v0, Lih/f;

    invoke-direct {v0, p1}, Lih/f;-><init>(Ldg/o;)V

    return-object v0
.end method
