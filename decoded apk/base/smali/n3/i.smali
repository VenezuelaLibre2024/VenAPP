.class public interface abstract Ln3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln3/i;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Ln3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/i$a;

    invoke-direct {v0}, Ln3/i$a;-><init>()V

    sput-object v0, Ln3/i;->a:Ln3/i;

    new-instance v0, Ln3/k$a;

    invoke-direct {v0}, Ln3/k$a;-><init>()V

    invoke-virtual {v0}, Ln3/k$a;->c()Ln3/k;

    move-result-object v0

    sput-object v0, Ln3/i;->b:Ln3/i;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
