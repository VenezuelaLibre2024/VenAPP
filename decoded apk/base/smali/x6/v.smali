.class public interface abstract Lx6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/v$b;
    }
.end annotation


# static fields
.field public static final a:Lx6/v;

.field public static final b:Lx6/v;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx6/v$a;

    invoke-direct {v0}, Lx6/v$a;-><init>()V

    sput-object v0, Lx6/v;->a:Lx6/v;

    sput-object v0, Lx6/v;->b:Lx6/v;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public abstract b(Landroid/os/Looper;Lu6/m3;)V
.end method

.method public abstract c(Lx6/u$a;Lt6/u1;)Lx6/n;
.end method

.method public abstract d(Lt6/u1;)I
.end method

.method public e(Lx6/u$a;Lt6/u1;)Lx6/v$b;
    .locals 0

    sget-object p1, Lx6/v$b;->a:Lx6/v$b;

    return-object p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
