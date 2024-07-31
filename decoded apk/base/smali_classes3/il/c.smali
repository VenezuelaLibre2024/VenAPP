.class public final Lil/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lel/h0;

.field private static final b:Lel/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "NO_OWNER"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lil/c;->a:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "ALREADY_LOCKED_BY_OWNER"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lil/c;->b:Lel/h0;

    return-void
.end method

.method public static final a(Z)Lil/a;
    .locals 1

    new-instance v0, Lil/b;

    invoke-direct {v0, p0}, Lil/b;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)Lil/a;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lil/c;->a(Z)Lil/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lel/h0;
    .locals 1

    sget-object v0, Lil/c;->a:Lel/h0;

    return-object v0
.end method
