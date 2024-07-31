.class public Ln3/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln3/p<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field private static final a:Ln3/x$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/x$a<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/x$a;

    invoke-direct {v0}, Ln3/x$a;-><init>()V

    sput-object v0, Ln3/x$a;->a:Ln3/x$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ln3/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ln3/x$a<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Ln3/x$a;->a:Ln3/x$a;

    return-object v0
.end method


# virtual methods
.method public d(Ln3/s;)Ln3/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/s;",
            ")",
            "Ln3/o<",
            "TModel;TModel;>;"
        }
    .end annotation

    invoke-static {}, Ln3/x;->c()Ln3/x;

    move-result-object p1

    return-object p1
.end method
