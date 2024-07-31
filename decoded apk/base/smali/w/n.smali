.class public interface abstract Lw/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/camera/core/impl/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Landroidx/camera/core/impl/b1;->a(Ljava/lang/Object;)Landroidx/camera/core/impl/b1;

    move-result-object v0

    sput-object v0, Lw/n;->a:Landroidx/camera/core/impl/b1;

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/b1;
    .locals 1

    sget-object v0, Lw/n;->a:Landroidx/camera/core/impl/b1;

    return-object v0
.end method

.method public abstract b(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/o;",
            ">;)",
            "Ljava/util/List<",
            "Lw/o;",
            ">;"
        }
    .end annotation
.end method
