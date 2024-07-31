.class public interface abstract Lf2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/m$b;
    }
.end annotation


# static fields
.field public static final a:Lf2/m$b$c;

.field public static final b:Lf2/m$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/m$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/m$b$c;-><init>(Lf2/m$a;)V

    sput-object v0, Lf2/m;->a:Lf2/m$b$c;

    new-instance v0, Lf2/m$b$b;

    invoke-direct {v0, v1}, Lf2/m$b$b;-><init>(Lf2/m$a;)V

    sput-object v0, Lf2/m;->b:Lf2/m$b$b;

    return-void
.end method


# virtual methods
.method public abstract getResult()Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Lf2/m$b$c;",
            ">;"
        }
    .end annotation
.end method
