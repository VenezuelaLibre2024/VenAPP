.class public final Lgk/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgk/f$c<",
        "Lgk/d;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Lgk/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgk/d$b;

    invoke-direct {v0}, Lgk/d$b;-><init>()V

    sput-object v0, Lgk/d$b;->a:Lgk/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
