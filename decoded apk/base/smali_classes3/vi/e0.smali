.class public abstract Lvi/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/e0$b;
    }
.end annotation


# static fields
.field public static final a:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Lvi/e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "internal:io.grpc.config-selector"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lvi/e0;->a:Lvi/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lvi/p0$f;)Lvi/e0$b;
.end method
