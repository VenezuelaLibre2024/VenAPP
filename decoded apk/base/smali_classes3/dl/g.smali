.class final Ldl/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgk/Continuation<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ldl/g;

.field private static final b:Lgk/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldl/g;

    invoke-direct {v0}, Ldl/g;-><init>()V

    sput-object v0, Ldl/g;->a:Ldl/g;

    sget-object v0, Lgk/g;->a:Lgk/g;

    sput-object v0, Ldl/g;->b:Lgk/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lgk/f;
    .locals 1

    sget-object v0, Ldl/g;->b:Lgk/f;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
