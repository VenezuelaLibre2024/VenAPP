.class public abstract Ln1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/a$a;,
        Ln1/a$b;
    }
.end annotation


# static fields
.field public static final a:Ln1/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/a$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ln1/a;->a:Ln1/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Ln1/a;
    .locals 1

    sget-object v0, Ln1/a;->a:Ln1/a$b;

    invoke-virtual {v0, p0}, Ln1/a$b;->a(Landroid/content/Context;)Ln1/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Landroid/net/Uri;)Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end method
