.class public final Lio/grpc/internal/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Lvi/e1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Lvi/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.internal.GrpcAttributes.securityLevel"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p0;->a:Lvi/a$c;

    const-string v0, "io.grpc.internal.GrpcAttributes.clientEagAttrs"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p0;->b:Lvi/a$c;

    return-void
.end method
