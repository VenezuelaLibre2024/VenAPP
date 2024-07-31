.class public interface abstract Lpc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpc/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc/h;

    invoke-direct {v0}, Lpc/h;-><init>()V

    sput-object v0, Lpc/i;->a:Lpc/i;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ")",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation
.end method
