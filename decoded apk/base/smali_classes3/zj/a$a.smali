.class final Lzj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field static final a:Ldj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/b;

    invoke-direct {v0}, Luj/b;-><init>()V

    sput-object v0, Lzj/a$a;->a:Ldj/r;

    return-void
.end method