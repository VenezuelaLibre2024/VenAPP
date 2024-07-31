.class public final Ldl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lel/h0;

.field public static final b:Lel/h0;

.field public static final c:Lel/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldl/h;->a:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldl/h;->b:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldl/h;->c:Lel/h0;

    return-void
.end method
