.class public interface abstract Ln9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln9/f;

    invoke-direct {v0}, Ln9/f;-><init>()V

    sput-object v0, Ln9/b;->a:Ln9/b;

    return-void
.end method


# virtual methods
.method public abstract getAmount()I
.end method

.method public abstract getType()Ljava/lang/String;
.end method
