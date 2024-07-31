.class public abstract Lde/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lde/g;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field b:Lcom/google/firebase/inappmessaging/model/MessageType;

.field c:Lde/e;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lde/e;Lcom/google/firebase/inappmessaging/model/MessageType;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Lcom/google/firebase/inappmessaging/model/MessageType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/i;->c:Lde/e;

    iput-object p2, p0, Lde/i;->b:Lcom/google/firebase/inappmessaging/model/MessageType;

    iput-object p3, p0, Lde/i;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Lde/e;
    .locals 1

    iget-object v0, p0, Lde/i;->c:Lde/e;

    return-object v0
.end method

.method public b()Lde/g;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lde/i;->a:Lde/g;

    return-object v0
.end method

.method public c()Lcom/google/firebase/inappmessaging/model/MessageType;
    .locals 1

    iget-object v0, p0, Lde/i;->b:Lcom/google/firebase/inappmessaging/model/MessageType;

    return-object v0
.end method
