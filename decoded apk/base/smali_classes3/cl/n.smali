.class public final Lcl/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lel/h0;

.field private static final b:Lel/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcl/n;->a:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcl/n;->b:Lel/h0;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)Lcl/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcl/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcl/m;

    if-nez p0, :cond_0

    sget-object p0, Ldl/h;->a:Lel/h0;

    :cond_0
    invoke-direct {v0, p0}, Lcl/m;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()Lel/h0;
    .locals 1

    sget-object v0, Lcl/n;->a:Lel/h0;

    return-object v0
.end method

.method public static final synthetic c()Lel/h0;
    .locals 1

    sget-object v0, Lcl/n;->b:Lel/h0;

    return-object v0
.end method
