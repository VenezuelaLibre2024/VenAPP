.class public final Ldl/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lok/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/q<",
            "Lcl/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ldl/j$a;->a:Ldl/j$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/b0;->c(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lok/q;

    sput-object v0, Ldl/j;->a:Lok/q;

    return-void
.end method

.method public static final synthetic a()Lok/q;
    .locals 1

    sget-object v0, Ldl/j;->a:Lok/q;

    return-object v0
.end method
