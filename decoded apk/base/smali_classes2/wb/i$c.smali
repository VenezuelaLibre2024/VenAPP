.class Lwb/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwb/i$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwb/i$e<",
        "TJcePrimitiveT;>;"
    }
.end annotation


# instance fields
.field private final a:Lwb/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/j<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lwb/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb/j<",
            "TJcePrimitiveT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/i$c;->a:Lwb/j;

    return-void
.end method

.method synthetic constructor <init>(Lwb/j;Lwb/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lwb/i$c;-><init>(Lwb/j;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TJcePrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lwb/i$c;->a:Lwb/j;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lwb/j;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
